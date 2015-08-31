package com.dhcc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.dao.IStudentDao;
import com.dhcc.model.Student;
import com.dhcc.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public Student findStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudent() {
		return studentDao.findAllStudent();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
