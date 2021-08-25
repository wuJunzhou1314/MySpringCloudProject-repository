package com.zpark.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppMainClass {

	public static void main(String[] args) {
		
		SpringApplication.run(AppMainClass.class, args);
		
	}

}
