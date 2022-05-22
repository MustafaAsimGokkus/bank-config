package com.bank.sure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer    // it is configuration server
@EnableEurekaClient    //register to discovery as client
public class BankConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankConfigApplication.class, args);
	}

}
