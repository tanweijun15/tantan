/**
 * Copyright (c) 2008-2015 by DHCC
 * All rights reserved.
 */
package com.dhcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.model.User;
import com.dhcc.service.IUserService;

/**
 * @author <a href="mailto:tanweijun@dhcc.com.cn">tanweijun</a>
 * @date 2015年8月28日
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	public UserController() {
		System.out.println("init controller");
	}
	
	@RequestMapping("/reg")
	public String register(){
		System.out.println("注册");
		return "login";
	}
	
	@RequestMapping(value = "userlogin")
	public ModelAndView loginUser(User user) {
		boolean bool = userService.login(user);
		if(bool){
			//String message = "欢迎使用！";  
			return new ModelAndView("redirect:/StudentController");
		}else{
			String message = "用户名或密码不正确";  
			return new ModelAndView("login","message",message);
			
		}
	}
}