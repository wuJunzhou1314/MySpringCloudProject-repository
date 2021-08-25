package com.zpark.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients //添加Feign支持
@SpringBootApplication
@EnableEurekaClient
public class AppMainClass {

	public static void main(String[] args) {
		
		SpringApplication.run(AppMainClass.class, args);
		
	}

}
