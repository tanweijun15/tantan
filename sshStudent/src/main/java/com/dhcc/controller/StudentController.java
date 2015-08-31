/**
 * Copyright (c) 2008-2015 by DHCC
 * All rights reserved.
 */
package com.dhcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhcc.model.Student;
import com.dhcc.service.IStudentService;

/**
 * @author <a href="mailto:tanweijun@dhcc.com.cn">tanweijun</a>
 * @date 2015年8月28日
 */
@Controller
//@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	public static void main(String[] args) {
		System.out.println("进入StudentController");
	}
	@RequestMapping("allStu")
	public String findAllStudent(Model model) {
		System.out.println("hello spring");
		List<Student> studentList = studentService.findAllStudent();

		model.addAttribute("stuList", studentList);
		// 返回到这个页面
		return "student";
	}
}
