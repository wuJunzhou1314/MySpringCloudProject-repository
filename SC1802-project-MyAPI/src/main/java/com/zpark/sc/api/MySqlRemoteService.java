package com.zpark.sc.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zpark.sc.entity.po.UserPO;

@FeignClient("zpark-sc-mysql")
public interface MySqlRemoteService {
	
	@RequestMapping("/login/acct/remote")
	public UserPO loginRemote(@RequestParam("loginacct")String loginacct,@RequestParam("userpswd")String userpswd);
	
}
