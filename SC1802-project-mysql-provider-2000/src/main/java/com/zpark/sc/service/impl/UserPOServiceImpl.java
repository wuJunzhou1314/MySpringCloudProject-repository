package com.zpark.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.sc.entity.po.UserPO;
import com.zpark.sc.mapper.UserPOMapper;
import com.zpark.sc.service.UserPOService;
@Service
public class UserPOServiceImpl implements UserPOService {

	@Autowired
	UserPOMapper userPOMapper;
	
	@Override
	public UserPO login(String loginacct, String userpswd) {
		
		UserPO userPO = new UserPO();
		
		userPO.setLoginacct(loginacct);
		
		userPO.setUserpswd(userpswd);
		
		
		return userPOMapper.login(userPO);
	}

}
