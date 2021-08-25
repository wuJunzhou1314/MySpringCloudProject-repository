package com.zpark.sc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zpark.sc.api.MySQLRemoteService;
import com.zpark.sc.entity.po.UserPO;
import com.zpark.sc.entity.vo.UserLoginVO;

@Controller
public class LoginController {

	@Autowired
	private MySQLRemoteService mySQLRemoteService;
	
	@RequestMapping("/")
	public String toLoginPage() {
		
		//……index中数据，加载数据
		
		return "login";
	}
	@RequestMapping("/login/acct/remote")
	public String login(
			@RequestParam("loginacct")String loginacct,
			@RequestParam("userpswd") String userpswd,
			HttpSession session,
			ModelMap map) {
		
		UserPO userPO = mySQLRemoteService.loginRemote(loginacct, userpswd);
		
		if(userPO == null) {
			map.addAttribute("message", "用户名密码错误！");
			return "login";
		}
		
		UserLoginVO userLoginVO = new UserLoginVO(userPO.getId(),userPO.getUsername(),userPO.getEmail());
		
		session.setAttribute("userLoginVO", userLoginVO);
		
		return "redirect:/auth/user/index/page";
	}
	
	@RequestMapping("/auth/user/loginOut")
	public String loginOut(HttpSession session) {
		
		session.invalidate();  //对session重新初始化的方法
		
		//session.removeAttribute("userLoginVO");
		
		return "redirect:/auth/user/login/page";
		
	}
	
}
