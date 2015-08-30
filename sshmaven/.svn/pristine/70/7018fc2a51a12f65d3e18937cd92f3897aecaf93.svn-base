package com.dhcc.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.model.User;
import com.dhcc.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/reg")
	public String register(){
		System.out.println("tanweijun");
		return "index";
	}
	@RequestMapping("/user")
	public ModelAndView addUser(User user) {
		ModelAndView mav=null;
		user.setUsername("tanweijun");
		user.setPassword("pass");
		user.setCode("code");
		System.out.println(user.getPassword());
		user.setId(UUID.randomUUID().toString());
		user.setRegtime(new Date());
		try {
			userService.addUser(user);
			//request.setAttribute("user", user);
			mav = new ModelAndView();
			mav.setViewName("index");
			mav.addObject("user", user);
			mav.addObject("msg", "success");
			return mav;
		} catch (Exception e) {
			mav.setViewName("error");
			mav.addObject("user", null);
			mav.addObject("msg", "failed");
			return mav;
		}
		
	}

}