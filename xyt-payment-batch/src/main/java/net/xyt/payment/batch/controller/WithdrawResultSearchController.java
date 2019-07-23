package net.xyt.payment.batch.controller;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawResultSearchController {

	  @Autowired   
	  private JobLauncher jobLauncher; 
	  
	  @Autowired
	  private JobRegistry jobRegistry;

	/**
	 * 请求链接：例如http://localhost:8790//runJob/customerStatisJob
	 * @param jobName
	 * @return
	 * @throws Exception
	 */
	  @RequestMapping(value="/runJob/{jobName}")
	  public String testCustomerStatis(@PathVariable("jobName")String jobName) throws Exception{
		    JobParameters jobParameters = null;
	    	long currentTime = System.currentTimeMillis();
	    	if(jobName != null && !"".equals(jobName)){
	    		jobParameters = new JobParametersBuilder().addLong("currentTime", currentTime).addString("jobName", jobName).toJobParameters();
	    	}else {
				return "fail";
			}
	    	jobLauncher.run(jobRegistry.getJob(jobName), jobParameters);
	    	return "success";
	  }
}
