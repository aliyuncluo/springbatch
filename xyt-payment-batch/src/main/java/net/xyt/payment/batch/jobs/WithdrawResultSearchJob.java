package net.xyt.payment.batch.jobs;

import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.annotation.Transactional;

import net.xyt.payment.batch.JobGlobals;
import net.xyt.payment.batch.jobs.processor.WithdrawResultSearchItemProcessor;
import net.xyt.payment.batch.jobs.reader.WithdrawResultSearchItemReader;
import net.xyt.payment.batch.jobs.writer.WithdrawResultSearchItemWriter;

@EnableBatchProcessing
@Configuration
public class WithdrawResultSearchJob {

	private Logger logger = LoggerFactory.getLogger(WithdrawResultSearchJob.class);
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
    SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private WithdrawResultSearchItemReader withdrawResultSearchItemReader;
	
	@Autowired
	private WithdrawResultSearchItemProcessor withdrawResultSearchItemProcessor;
	
	@Autowired
	private WithdrawResultSearchItemWriter withdrawResultSearchItemWriter;
	
	//将ItemReader,ItemProcessor,ItemWriter注入到IOC容器
	@Bean 
	@StepScope
	public ItemReader<Map<String,Object>> withdrawItemReader(){
		return withdrawResultSearchItemReader;
	}
	
	@Bean
	@StepScope
	public ItemProcessor<Map<String,Object>,Map<String,Object>> withdrawItemProcessor(){
		return withdrawResultSearchItemProcessor;
	}
	
	@Bean
	@StepScope
	public ItemWriter<Map<String,Object>> withdrawItemWriter(){
		return withdrawResultSearchItemWriter;
	}
	
	/**
	 * 创建Step
	 * @param dayItemReader
	 * @param dayItemProcessor
	 * @param dayItemWriter
	 * @return
	 */
	@Transactional
	@Bean(name="withdrawResultSearchStep")
	public Step withdrawResultSearchStep(@Qualifier("withdrawItemReader") ItemReader<Map<String,Object>> withdrawItemReader,
			                               @Qualifier("withdrawItemProcessor") ItemProcessor<Map<String,Object>,Map<String,Object>> withdrawItemProcessor,
			                               @Qualifier("withdrawItemWriter") ItemWriter<Map<String,Object>> withdrawItemWriter) {
		logger.info("进入Step: ===开始进入提现结果查询Step===");
		return stepBuilderFactory.get("withdrawResultSearchStep")
				.<Map<String,Object>,Map<String,Object>>chunk(1) //批处理每次提交10条数据
                .reader(withdrawItemReader)
                .processor(withdrawItemProcessor)
                .writer(withdrawItemWriter)
                .faultTolerant() //定义容错机制
                .skipLimit(Integer.MAX_VALUE) //定义最大容错个数，超过该次数则抛出异常
                .skip(ValidationException.class) //定义容错的异常类，可添加多个。
                .skip(DuplicateKeyException.class)//主键冲突异常
                .build();
	}
	

	/**
	 * 创建Job
	 * @param withdrawResultSearchStep
	 * @return
	 */
	@Bean
	public Job jobWithdraw(@Qualifier("withdrawResultSearchStep")Step withdrawResultSearchStep) {
		logger.info("进入Job: ===开始进入提现结果查询JOB===");
		return jobBuilderFactory.get(JobGlobals.WITHDRAW_RESULT_SEARCH_JOB)
				.incrementer(new RunIdIncrementer())
				.start(withdrawResultSearchStep)
				.build();
	}
	
}
