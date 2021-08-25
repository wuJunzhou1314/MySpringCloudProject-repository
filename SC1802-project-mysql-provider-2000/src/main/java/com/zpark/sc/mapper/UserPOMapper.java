package com.zpark.sc.mapper;

import org.apache.ibatis.annotations.Select;

import com.zpark.sc.entity.po.UserPO;

public interface UserPOMapper {
	
	@Select("select * from t_user where loginacct = #{loginacct} and userpswd = #{userpswd}")
	public UserPO login(UserPO userPO);
	
}
