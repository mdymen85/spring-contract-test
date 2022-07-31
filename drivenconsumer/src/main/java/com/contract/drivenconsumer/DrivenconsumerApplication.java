package com.contract.drivenconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DrivenconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrivenconsumerApplication.class, args);
	}

}
