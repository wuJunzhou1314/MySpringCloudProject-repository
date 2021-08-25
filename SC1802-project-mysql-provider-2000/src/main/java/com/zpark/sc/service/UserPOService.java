package com.zpark.sc.service;

import com.zpark.sc.entity.po.UserPO;

public interface UserPOService {

	UserPO login(String loginacct, String userpswd);

}
