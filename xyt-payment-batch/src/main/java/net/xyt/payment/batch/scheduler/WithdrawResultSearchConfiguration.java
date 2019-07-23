package net.xyt.payment.batch.scheduler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.support.JobRegistryBeanPostProcessor;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import net.xyt.payment.batch.BatchConfig;
import net.xyt.payment.batch.JobGlobals;

@Configuration
public class WithdrawResultSearchConfiguration {

	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private JobLocator jobLocator;
	@Autowired
	private BatchConfig batchConfig;
	
	@Bean
	public JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor(JobRegistry jobRegistry) {
	    JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor = new JobRegistryBeanPostProcessor();
	    jobRegistryBeanPostProcessor.setJobRegistry(jobRegistry);
	    return jobRegistryBeanPostProcessor;
	}
	
	@Bean
	public JobDetailFactoryBean withdrawResultSearchBean() {
	    JobDetailFactoryBean factory = new JobDetailFactoryBean();
	    factory.setJobClass(QuartzJobLauncher.class);
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("jobName", JobGlobals.WITHDRAW_RESULT_SEARCH_JOB);
	    map.put("jobLauncher", jobLauncher);
	    map.put("jobLocator", jobLocator);
	    factory.setJobDataAsMap(map);
	    factory.setGroup("sample2_group");
	    factory.setName("sample2_job");
	    return factory;
	}
	
	/**
	 * 每天凌晨1点开始执行
	 * @return
	 */
	@Bean
	public CronTriggerFactoryBean withdrawResultSearchTriggerFactoryBean() {
	    CronTriggerFactoryBean stFactory = new CronTriggerFactoryBean();
	    JobDetailFactoryBean jobDetailFactoryBean=withdrawResultSearchBean();
	    if(jobDetailFactoryBean !=null) {
	    	stFactory.setJobDetail(jobDetailFactoryBean.getObject());
	    }
	    stFactory.setName("cron2_trigger");
	    stFactory.setGroup("cron2_group");
	    stFactory.setMisfireInstruction(2); //每两分钟执行一次
	    stFactory.setCronExpression(batchConfig.getCron("withwrawResultSearch"));
	    return stFactory;
	}
	
	@Bean
	public SchedulerFactoryBean customerStatisSchedulerFactoryBean() {
	    SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
	    scheduler.setTriggers(withdrawResultSearchTriggerFactoryBean().getObject());
	    return scheduler;
	}
}
