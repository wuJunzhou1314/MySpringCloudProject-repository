package com.zpark.sc.contorller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test/spring/session/get")
	public String testSession(HttpSession session) {
		
		String value = (String) session.getAttribute("奥巴马");
		
		return value;
	}
	
}
