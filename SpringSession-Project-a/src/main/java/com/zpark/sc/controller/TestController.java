package com.zpark.sc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   
	@RequestMapping("/test/spring/session")
	public String testSession(HttpSession session) {
		
		session.setAttribute("奥巴马", "卢锡安");
		
		return "数据已存入Session中！";
	}
	
}
