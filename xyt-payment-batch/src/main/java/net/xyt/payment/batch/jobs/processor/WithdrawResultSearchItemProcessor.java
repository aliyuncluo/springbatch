package net.xyt.payment.batch.jobs.processor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.xyt.payment.api.common.CommonHttpRequest;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecord;

@Component
public class WithdrawResultSearchItemProcessor implements ItemProcessor<Map<String,Object>,Map<String,Object>>{

	private Logger logger = LoggerFactory.getLogger(WithdrawResultSearchItemProcessor.class);
	
	@Value("${xyt.payment.mch_no}")
	private String mch_no;
	@Value("${xyt.payment.pay_tenant_id}")
	private String pay_tenant_id;
	
	@Transactional
	public Map<String, Object> process(Map<String, Object> map) throws Exception {
		logger.info("===进入到提现结果查询：WithdrawResultSearchItemProcessor...===");
		List<PayWithdrawRecord> list = (List<PayWithdrawRecord>) map.get("list");
		logger.info("获取的list集合大小为="+list.size());
		List<Map<String,Object>> resultList = new ArrayList<>();
		for(PayWithdrawRecord payWithdrawRecord:list) {
			String orderId = payWithdrawRecord.getOrderId();
			Map<String,String> ebookRequest = new HashMap<>();
			ebookRequest.put("order_id", orderId);
			ebookRequest.put("version", "1.0.0");
			ebookRequest.put("mch_no", mch_no);
			ebookRequest.put("pay_tenant_id", pay_tenant_id);
			//调用e账通的提现查询接口
			logger.info("传入e账通的请求参数为="+ebookRequest);
			long startime=System.currentTimeMillis();
			Map<String, Object> ebookResponse = CommonHttpRequest.sendHttpPostRequest("/api/cloudwallet/withdrawQuery", ebookRequest);
			long endtime=System.currentTimeMillis();
			logger.info("调用e账通共耗时="+(endtime-startime)+"ms");
			resultList.add(ebookResponse);
		}
		Map<String,Object> result = new HashMap<>();
		result.put("result", resultList);
		return result;
	}

}
