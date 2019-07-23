package net.xyt.payment.batch.jobs.reader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import net.xyt.payment.api.common.CommonHttpRequest;
import net.xyt.payment.api.common.Constants;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecord;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecordExample;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecordExample.Criteria;
import net.xyt.payment.batch.mapper.withdraw.PayWithdrawRecordMapper;
@Component
public class WithdrawResultSearchItemReader implements ItemReader<Map<String,Object>>{

	private Logger logger = LoggerFactory.getLogger(WithdrawResultSearchItemReader.class);
	
	@Autowired
	private PayWithdrawRecordMapper payWithdrawRecordMapper;
	
	private boolean jobEnd = false;
	
	public Map<String, Object> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		logger.info("===开始进入提现结果查询：WithdrawResultSearchItemReader===");
		if(!jobEnd) {
			//查询提现记录表中的未入账记录clear_flag
			PayWithdrawRecordExample example = new PayWithdrawRecordExample();
			Criteria criteria = example.createCriteria();
			criteria.andClearFlagEqualTo(Constants.ClearFlag.NO_CLEAR);//查询未清算的
			List<PayWithdrawRecord> list = payWithdrawRecordMapper.selectByExample(example);
			Map<String,Object> result = new HashMap<>();
			if(list!=null && list.size()>0) {
				result.put("list", list);
			}
			jobEnd = true;
			return result;
		}else {
			jobEnd=false;
			return null;
		}
	}

}
