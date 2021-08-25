package com.zpark.sc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zpark.sc.entity.po.UserPO;
import com.zpark.sc.mapper.UserPOMapper;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMyBatis {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private UserPOMapper userPOMapper;
	
	//@Test
	public void testConnection() throws SQLException {
		
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		
	}
	@Test
	public void testMapper() {
		
		UserPO userPO = new UserPO();
		
		userPO.setLoginacct("vn");
		
		userPO.setUserpswd("123123");
		
		UserPO login = userPOMapper.login(userPO);
		
		System.out.println(login);
		
		
	}
	
}
