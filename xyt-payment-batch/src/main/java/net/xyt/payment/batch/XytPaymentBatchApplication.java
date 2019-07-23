package net.xyt.payment.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//开启批处理启动
@EnableBatchProcessing
@SpringBootApplication
public class XytPaymentBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(XytPaymentBatchApplication.class, args);
	}

}
