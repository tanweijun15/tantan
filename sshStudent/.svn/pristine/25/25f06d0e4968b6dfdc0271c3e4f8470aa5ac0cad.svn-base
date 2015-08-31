package com.dhcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.model.User;
import com.dhcc.service.IUserService;


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
		System.out.println("tanweijun");
		return "index";
	}
	@RequestMapping("userlogin")
	public ModelAndView loginUser(User user) {
		boolean bool = userService.login(user);
		if(bool){
			String message = "欢迎使用！";  
			return new ModelAndView("student","message",message);
		}else{
			String message = "用户名或密码不正确";  
			return new ModelAndView("login","message",message);
			
		}
		
		
		/*ModelAndView mav=null;
		user.setUsername("tanweijun");
		user.setPassword("pass");
		System.out.println(user.getPassword());
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
		}*/
	}

}