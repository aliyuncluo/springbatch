package net.xyt.payment.batch.scheduler;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.quartz.QuartzJobBean;

import net.xyt.payment.batch.JobEnum;

public class QuartzJobLauncher extends QuartzJobBean {
	private static final Logger log = LoggerFactory.getLogger(QuartzJobLauncher.class);
	
	private String jobName;
	private JobLauncher jobLauncher;
	private JobLocator jobLocator;
	public String getJobName() {
	    return jobName;
	}

	public void setJobName(String jobName) {
	    this.jobName = jobName;
	}
  
	public JobLauncher getJobLauncher() {
	    return jobLauncher;
	}

	public void setJobLauncher(JobLauncher jobLauncher) {
	    this.jobLauncher = jobLauncher;
	}

	

	public JobLocator getJobLocator() {
		return jobLocator;
	}

	public void setJobLocator(JobLocator jobLocator) {
		this.jobLocator = jobLocator;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
	    try {
	        Job job = jobLocator.getJob(jobName);
	        log.info("当前job:"+jobName);
	        JobParameters jobParameters = new JobParametersBuilder()
                    .addDate("date", new Date()).addString("jobType", JobEnum.JOB_TIMING.getDesc())       
                    .toJobParameters();
	        JobExecution jobExecution = jobLauncher.run(job, jobParameters);
	        log.info("{}_{} was completed successfully", job.getName(), jobExecution.getId());
	        
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	log.error("Encountered job execution exception!");
	    }
	}

}
