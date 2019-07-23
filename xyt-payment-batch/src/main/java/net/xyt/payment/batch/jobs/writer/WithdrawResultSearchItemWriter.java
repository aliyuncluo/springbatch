package net.xyt.payment.batch.jobs.writer;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.xyt.payment.api.common.CommonHttpRequest;
import net.xyt.payment.api.common.Constants;
import net.xyt.payment.api.common.ResStatus;
import net.xyt.payment.api.common.exception.BizException;
import net.xyt.payment.api.common.util.SequenceUtils;
import net.xyt.payment.batch.entity.acctdetail.PayAcctDetail;
import net.xyt.payment.batch.entity.acctinfo.PayAcctInfo;
import net.xyt.payment.batch.entity.acctinfo.PayAcctInfoExample;
import net.xyt.payment.batch.entity.flowrecord.PayFlowRecord;
import net.xyt.payment.batch.entity.transpay.PayTransPayRecord;
import net.xyt.payment.batch.entity.transrcv.PayTransRcvRecord;
import net.xyt.payment.batch.entity.userinfo.PayUserInfo;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecord;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecordExample;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecordExample.Criteria;
import net.xyt.payment.batch.mapper.acctdetail.PayAcctDetailMapper;
import net.xyt.payment.batch.mapper.acctinfo.PayAcctInfoMapper;
import net.xyt.payment.batch.mapper.flowrecord.PayFlowRecordMapper;
import net.xyt.payment.batch.mapper.transpay.PayTransPayRecordMapper;
import net.xyt.payment.batch.mapper.transrcv.PayTransRcvRecordMapper;
import net.xyt.payment.batch.mapper.userinfo.PayUserInfoMapper;
import net.xyt.payment.batch.mapper.withdraw.PayWithdrawRecordMapper;

@Component
public class WithdrawResultSearchItemWriter implements ItemWriter<Map<String,Object>>{
	
	 //redis中存储账户类型信息
	public static final String REDIS_ACCT_TYPE_INFO="ex_acct_type_info";

	private Logger logger = LoggerFactory.getLogger(WithdrawResultSearchItemWriter.class);
	@Autowired
	private PayWithdrawRecordMapper payWithdrawRecordMapper;
	@Autowired
	private PayFlowRecordMapper payFlowRecordMapper;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private PayAcctInfoMapper payAcctInfoMapper;
	@Autowired
	private PayUserInfoMapper payUserInfoMapper;
	@Autowired
	private PayAcctDetailMapper payAcctDetailMapper;
	@Autowired
	private PayTransPayRecordMapper payTransPayRecordMapper;
	@Autowired
	private PayTransRcvRecordMapper payTransRcvRecordMapper;
	@Value("${xyt.payment.mch_no}")
	private String mch_no;
	@Value("${xyt.payment.pay_tenant_id}")
	private String pay_tenant_id;
	@Value("${xyt.payment.platform_ex_acct_no}")
	private String platform_ex_acct_no;
	
	@Transactional
	public void write(List<? extends Map<String, Object>> list) throws Exception {
		logger.info("===进入到提现结果查询：WithdrawResultSearchItemWriter...===");
		Map<String, Object> map = list.get(0);
		List<Map<String,Object>> resultList= (List<Map<String, Object>>) map.get("result");
		for(Map<String,Object> result:resultList) {
			//付款账号
			String pay_ex_acct_no = String.valueOf(result.get("pay_ex_acct_no"));
			//交易状态
			String tradeStatus = String.valueOf(result.get("status"));
			//提现金额
			String amount = String.valueOf(result.get("amount"));
			BigDecimal tradeAmt = new BigDecimal(amount).divide(new BigDecimal(100));
			//附属账户类型
			String ex_acct_type = String.valueOf(stringRedisTemplate.opsForHash().get(REDIS_ACCT_TYPE_INFO, pay_ex_acct_no));
			//手续费金额
			BigDecimal feeAmt=null;
			if(ex_acct_type.equals(Constants.UserType.PERSONAL)) {
			    //个人用户
				feeAmt = new BigDecimal(2);
			}else if(ex_acct_type.equals(Constants.UserType.COMPANY)) {
				//企业用户
				feeAmt = new BigDecimal(7);
			}
			//如果交易成功
			if(tradeStatus.equals(Constants.TradeStatus.SUCCESS)) {
				//更新提现记录表的状态
				String order_id = String.valueOf(result.get("order_id"));
				PayWithdrawRecord record = new PayWithdrawRecord();
				record.setClearFlag(Constants.ClearFlag.HAS_CLEAR); //已入账
				PayWithdrawRecordExample example = new PayWithdrawRecordExample();
				Criteria criteria = example.createCriteria();
				criteria.andOrderIdEqualTo(order_id);
				int updateNum = payWithdrawRecordMapper.updateByExampleSelective(record, example);
				logger.info("更新提现记录表的条数为="+updateNum);
			}
			//如果交易失败,退款
			if(tradeStatus.equals(Constants.TradeStatus.FAILURE)) {
				//退还平台收取的手续费
				rebackUserFeeAmt(feeAmt,pay_ex_acct_no);
				//交易记录表
				PayFlowRecord payFlowRecord = new PayFlowRecord();
				String flowNo = SequenceUtils.getSequenceNo();
				payFlowRecord.setFlowNo(flowNo);
				payFlowRecord.setTradeType(Constants.TradeType.REFUND);
				payFlowRecord.setTradeContent("提现交易银行代扣失败--退款");
				payFlowRecord.setTradeStatus(tradeStatus);
				payFlowRecord.setTradeAmt(tradeAmt);
				payFlowRecord.setFeeAmt(feeAmt);
				payFlowRecord.setExAcctNo(pay_ex_acct_no);
				String order_id = SequenceUtils.getSequenceNo();
				payFlowRecord.setOrderId(order_id);
				payFlowRecord.setOperator("system");
				payFlowRecord.setCreateTime(new Date());
				payFlowRecord.setModifier("system");
				payFlowRecord.setModifyTime(new Date());
				payFlowRecord.setDeleted(Constants.Deleted.ENABLE.byteValue());
				int insertNum_1 = payFlowRecordMapper.insertSelective(payFlowRecord);
				logger.info("插入到交易流水表的记录数为="+insertNum_1);
				
				Map<String, Object> acctBalInfo = searchBalInfoByAcctno(pay_ex_acct_no);
				//账户余额
				BigDecimal balance = new BigDecimal(String.valueOf(acctBalInfo.get("balance"))).divide(new BigDecimal(100));
				//账户可用余额
				BigDecimal avail_balance = new BigDecimal(String.valueOf(acctBalInfo.get("avail_balance"))).divide(new BigDecimal(100));
				//账户可提取余额
				BigDecimal withdraw_balance = new BigDecimal(String.valueOf(acctBalInfo.get("withdraw_balance"))).divide(new BigDecimal(100));
				
				//账户明细表
				PayAcctDetail payAcctDetail = new PayAcctDetail();
				payAcctDetail.setFlowNo(flowNo);
				payAcctDetail.setExAcctNo(pay_ex_acct_no);
				payAcctDetail.setTradeType(Constants.TradeType.REFUND);
				payAcctDetail.setTradeAmt(tradeAmt.add(feeAmt));
				payAcctDetail.setTradeTime(new Date());
				payAcctDetail.setRedirect(Constants.Redirect.INCOME);
				payAcctDetail.setAcctBalance(balance);
				payAcctDetail.setAviUseBal(avail_balance);
				payAcctDetail.setAviDrawBal(withdraw_balance);
				payAcctDetail.setOperator("system");
				payAcctDetail.setCreateTime(new Date());
				payAcctDetail.setModifier("system");
				payAcctDetail.setModifyTime(new Date());
				payAcctDetail.setDeleted(Constants.Deleted.ENABLE.byteValue());
				int insertNum_2 = payAcctDetailMapper.insertSelective(payAcctDetail);
				logger.info("插入到账户明细表的记录数为="+insertNum_2);
				//更新附属账户信息表
				PayAcctInfo payAcctInfo = new PayAcctInfo();
				payAcctInfo.setTotalBalAmt(balance);
				payAcctInfo.setAviBalAmt(avail_balance);
				payAcctInfo.setAviDrawAmt(withdraw_balance);
				PayAcctInfoExample example = new PayAcctInfoExample();
				net.xyt.payment.batch.entity.acctinfo.PayAcctInfoExample.Criteria criteria = example.createCriteria();
				criteria.andExAcctNoEqualTo(pay_ex_acct_no);
				int updateNum_1 = payAcctInfoMapper.updateByExampleSelective(payAcctInfo, example);
				logger.info("更新附属账户信息表的记录数为="+updateNum_1);
			}
		}
		
	}

	/**
	 * 退还平台收取的手续费
	 * @tradeAmt 提现的金额
	 * @feeAmt 手续费金额
	 */
	public void rebackUserFeeAmt(BigDecimal feeAmt,String ex_acct_no){
		
		//转账交易 平台附属账户--->用户
		Map<String,String> platformRequest = new HashMap<>();
		platformRequest.put("version", "1.0.0");
		platformRequest.put("pay_tenant_id", pay_tenant_id);
		platformRequest.put("mch_no", mch_no);
		platformRequest.put("order_id", SequenceUtils.getSequenceNo());
		platformRequest.put("txn_type", Constants.TradeType.TRANS_VIRTUAL);
		platformRequest.put("pay_ex_acct_no", platform_ex_acct_no);
		platformRequest.put("recv_ex_acct_no", ex_acct_no);
		platformRequest.put("amount", String.valueOf(feeAmt.multiply(new BigDecimal(100))));
		platformRequest.put("send_date", new SimpleDateFormat("yyyyMMdd").format(new Date()));
		platformRequest.put("send_time", new SimpleDateFormat("HHmmss").format(new Date()));
		platformRequest.put("password", "123456");
		platformRequest.put("metadata[operator]", "system");
		
		logger.info("传入e账通的请求参数为="+platformRequest);
		long startime = System.currentTimeMillis();
		Map<String, Object> ebookResponse = CommonHttpRequest.sendHttpPostRequest("/api/cloudwallet/transfer", platformRequest);
		long endtime = System.currentTimeMillis();
		logger.info("调用e账通接口共耗时："+(endtime-startime)+"ms");
		//交易状态
		String tradeStatus = String.valueOf(ebookResponse.get("status"));
		try {
			//保存到交易流水表
			PayFlowRecord payFlowRecord = new PayFlowRecord();
			String flowNo = SequenceUtils.getSequenceNo();
			payFlowRecord.setFlowNo(flowNo);
			payFlowRecord.setExAcctNo(platform_ex_acct_no);
			payFlowRecord.setTradeType(Constants.TradeType.REFUND);
			payFlowRecord.setTradeContent("银行代扣失败，平台返回给用户收取的手续费");
			payFlowRecord.setTradeAmt(feeAmt);
			payFlowRecord.setTradeStatus(tradeStatus);
			payFlowRecord.setFeeAmt(new BigDecimal(0));
			payFlowRecord.setOrderId(SequenceUtils.getSequenceNo());
			payFlowRecord.setOperator("system");
			payFlowRecord.setCreateTime(new Date());
			payFlowRecord.setModifier("system");
			payFlowRecord.setModifyTime(new Date());
			payFlowRecord.setDeleted(Constants.Deleted.ENABLE.byteValue());
			int insertNum_1 = payFlowRecordMapper.insertSelective(payFlowRecord);
			logger.info("插入到交易流水表的记录数为="+insertNum_1);
			//保存付款方记录表
			PayTransPayRecord payTransPayRecord = new PayTransPayRecord();
			payTransPayRecord.setFlowNo(flowNo);
			payTransPayRecord.setPlatformCode(null);
			payTransPayRecord.setPayAcctNo(platform_ex_acct_no);
			payTransPayRecord.setPayTransAmt(feeAmt);
			payTransPayRecord.setFeeAmt(new BigDecimal(0));
			payTransPayRecord.setFeeRate(new BigDecimal(0));
			payTransPayRecord.setTradeType(Constants.TradeType.REFUND);
			payTransPayRecord.setTradeContent("银行代扣失败，平台返回给用户收取的手续费");
			payTransPayRecord.setTradeStatus(tradeStatus);
			payTransPayRecord.setOperator("system");
			payTransPayRecord.setCreateTime(new Date());
			payTransPayRecord.setModifier("system");
			payTransPayRecord.setModifyTime(new Date());
			payTransPayRecord.setDeleted(Constants.Deleted.ENABLE.byteValue());
			int insertRecord1 = payTransPayRecordMapper.insertSelective(payTransPayRecord);
			logger.info("插入付款方记录表的条数为="+insertRecord1);
			Long payId = payTransPayRecord.getPkid();
			//保存到收款方记录表
			PayTransRcvRecord payTransRcvRecord = new PayTransRcvRecord();
			payTransRcvRecord.setRcvAcctNo(ex_acct_no);
			payTransRcvRecord.setRcvTransAmt(feeAmt);
			payTransRcvRecord.setTradeType(Constants.TradeType.REFUND);
			payTransRcvRecord.setTradeContent("银行代扣失败，平台返回给用户收取的手续费");
			payTransRcvRecord.setTradeStatus(tradeStatus);
			payTransRcvRecord.setRmrk(null);
			payTransRcvRecord.setPayAcctNo(platform_ex_acct_no);
			payTransRcvRecord.setPayId(payId);
			payTransRcvRecord.setOperator("system");
			payTransRcvRecord.setCreateTime(new Date());
			payTransRcvRecord.setModifier("system");
			payTransRcvRecord.setModifyTime(new Date());
			payTransRcvRecord.setDeleted(Constants.Deleted.ENABLE.byteValue());
			int insertRecord2 = payTransRcvRecordMapper.insertSelective(payTransRcvRecord);
			logger.info("保存到转账收款方记录表的条数为="+insertRecord2);
			
			Map<String, Object> balInfoMap = searchBalInfoByAcctno(platform_ex_acct_no);
			//账户余额
			BigDecimal balance = new BigDecimal(String.valueOf(balInfoMap.get("balance"))).divide(new BigDecimal(100));
			//账户可用余额
			BigDecimal avail_balance = new BigDecimal(String.valueOf(balInfoMap.get("avail_balance"))).divide(new BigDecimal(100));
			//账户可提取余额
			BigDecimal withdraw_balance = new BigDecimal(String.valueOf(balInfoMap.get("withdraw_balance"))).divide(new BigDecimal(100));
			
			//保存到账户明细表
			PayAcctDetail payAcctDetail = new PayAcctDetail();
			payAcctDetail.setFlowNo(flowNo);
			payAcctDetail.setExAcctNo(platform_ex_acct_no);
			payAcctDetail.setTradeType(Constants.TradeType.REFUND);
			payAcctDetail.setTradeAmt(feeAmt);
			payAcctDetail.setTradeTime(new Date());
			payAcctDetail.setRedirect(Constants.Redirect.EXPEND); //支付
			payAcctDetail.setAcctBalance(balance);
			payAcctDetail.setAviUseBal(avail_balance);
			payAcctDetail.setAviDrawBal(withdraw_balance);
			payAcctDetail.setOperator("system");
			payAcctDetail.setCreateTime(new Date());
			payAcctDetail.setModifier("system");
			payAcctDetail.setModifyTime(new Date());
			payAcctDetail.setDeleted(Constants.Deleted.ENABLE.byteValue());
			int insertNum_2 = payAcctDetailMapper.insertSelective(payAcctDetail);
			logger.info("保存到账户明细表的记录数为="+insertNum_2);
			//更新附属账户信息表
			PayAcctInfo payAcctInfo = new PayAcctInfo();
			payAcctInfo.setTotalBalAmt(balance);
			payAcctInfo.setAviBalAmt(avail_balance);
			payAcctInfo.setAviDrawAmt(withdraw_balance);
			PayAcctInfoExample example = new PayAcctInfoExample();
			net.xyt.payment.batch.entity.acctinfo.PayAcctInfoExample.Criteria criteria = example.createCriteria();
			criteria.andExAcctNoEqualTo(platform_ex_acct_no);
			int updateNum_1 = payAcctInfoMapper.updateByExampleSelective(payAcctInfo, example);
			logger.info("更新附属账户信息表的记录数为="+updateNum_1);
		} catch (Exception e) {
			logger.info(ResStatus.SAVE_FEE_RECORD_FAIL.getMessage());
			throw new BizException(ResStatus.SAVE_FEE_RECORD_FAIL,e);
		}
	}
	
	
	/**
	 * 根据附属账号查询余额信息
	 * @param pay_ex_acct_no
	 * @return
	 */
	public Map<String,Object> searchBalInfoByAcctno(String pay_ex_acct_no) {
		Map<String,Object> balanceMap = new HashMap<>();
		Map<String,String> userAccountMap = new HashMap<>();
		String mch_user_id = searchAcctBalByAcctNo(pay_ex_acct_no);
		userAccountMap.put("mch_user_id", mch_user_id); //商户用户号
		Map<String, Object> userAcctInfoMap = this.userAcctInfoSearch(userAccountMap);
		logger.info("查询的用户信息为="+userAcctInfoMap);
		if(userAcctInfoMap!=null && userAcctInfoMap.size()>0) {
			List<Map<String,Object>> acct_list = (List<Map<String, Object>>) userAcctInfoMap.get("acct_list");
			for(Map<String,Object> acctMap: acct_list) {
				String ex_acct_no = String.valueOf(acctMap.get("ex_acct_no"));
				if(ex_acct_no.equals(pay_ex_acct_no)) {
					//账户余额
					String balance = String.valueOf(acctMap.get("balance"));
					//可用余额
					String avail_balance = String.valueOf(acctMap.get("avail_balance"));
					//可提现余额
					String withdraw_balance = String.valueOf(acctMap.get("withdraw_balance"));
					balanceMap.put("balance", balance);
					balanceMap.put("avail_balance", avail_balance);
					balanceMap.put("withdraw_balance", withdraw_balance);
				}
			}
		}
		return balanceMap;
	}
	
	/**
	 * 用户账户信息查询
	 * @param platformRequest
	 */
	public Map<String,Object> userAcctInfoSearch(Map<String,String> platformRequest){
		platformRequest.put("version", "1.0.0");
		platformRequest.put("mch_no", mch_no);
		platformRequest.put("pay_tenant_id", pay_tenant_id);
		logger.info("传入e账通的请求参数为="+platformRequest);
		long startime = System.currentTimeMillis();
		Map<String, Object> ebookResponse = CommonHttpRequest.sendHttpPostRequest("/api/cloudwallet/userAccsQuery", platformRequest);
		long endtime = System.currentTimeMillis();
		logger.info("调用e账通接口耗时"+(endtime-startime)+"ms");
		logger.info("e账通返回的响应报文信息为="+ebookResponse);
		return ebookResponse;
	}
	
   /**
    * 根据附属账号查询商户用户ID
    * ex_acct_no ---> mch_user_id
    */
	public String searchAcctBalByAcctNo(String ex_acct_no){
		PayAcctInfoExample example = new PayAcctInfoExample();
		net.xyt.payment.batch.entity.acctinfo.PayAcctInfoExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andExAcctNoEqualTo(ex_acct_no);
		List<PayAcctInfo> list = payAcctInfoMapper.selectByExample(example);
		String mch_user_id=null;
		if(list!=null && list.size()>0) {
			Long userId = list.get(0).getUserId();
			PayUserInfo payUserInfo = payUserInfoMapper.selectByPrimaryKey(userId);
			mch_user_id = payUserInfo.getMchUserId();
		}
		return mch_user_id;
	}
}
