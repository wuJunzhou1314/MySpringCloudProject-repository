package com.zpark.sc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class AuthWebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/auth/user/login/page").setViewName("login");
		
		registry.addViewController("/auth/user/register/page").setViewName("register");
		
		registry.addViewController("/auth/user/index/page").setViewName("index");
		
	}
	
}
