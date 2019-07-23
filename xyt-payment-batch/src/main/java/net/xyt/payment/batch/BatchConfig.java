package net.xyt.payment.batch;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 上传配置类
 */
@Configuration
@ConfigurationProperties(prefix = "xyt.batch")
public class BatchConfig {
	private Map<String, String> cron;
    private int chunk; 
    private int pageSize;
    private String email;
    private String mobile;
    private String byFrom;
	public String getByFrom() {
		return byFrom;
	}

	public void setByFrom(String byFrom) {
		this.byFrom = byFrom;
	}

	public String getCron(String key) {
		if(cron.containsKey(key)) {
			return cron.get(key);
		}
		return null;
	}

	public void setCron(Map<String, String> cron) {
		this.cron = cron;
	}

	public int getChunk() {
		return chunk;
	}

	public void setChunk(int chunk) {
		this.chunk = chunk;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}
