package com.zpark.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zpark.sc.entity.po.UserPO;
import com.zpark.sc.service.UserPOService;

@RestController
public class UserProviderController {
	
	@Autowired
	UserPOService userPOService;
	
	@RequestMapping("/login/acct/remote")
	public UserPO loginRemote(@RequestParam("loginacct")String loginacct,@RequestParam("userpswd")String userpswd) {
		
		UserPO userPO = userPOService.login(loginacct,userpswd);
		
		return userPO;
	}
	
}
