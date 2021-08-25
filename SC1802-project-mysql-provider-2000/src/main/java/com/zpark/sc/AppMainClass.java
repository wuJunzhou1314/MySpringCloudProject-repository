package com.zpark.sc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zpark.sc.mapper")
public class AppMainClass {

	public static void main(String[] args) {
		
		SpringApplication.run(AppMainClass.class, args);
		
	}

}
