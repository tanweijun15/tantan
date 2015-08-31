/**
 * Copyright (c) 2008-2015 by DHCC
 * All rights reserved.
 */
package com.dhcc.service;

import java.util.List;

import com.dhcc.model.Student;

public interface IStudentService {
	//查找用户信息
	Student findStudent(Student student);
	//获得所有的人员信息
	List<Student> findAllStudent();
	//更新用户信息
	Student updateStudent(Student student);
	//删除用户信息
	boolean deleteStudent(Student student);
	//增加用户信息
	boolean addStudent(Student student);
}
