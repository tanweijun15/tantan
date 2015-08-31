package com.dhcc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dao.IStudentDao;
import com.dhcc.model.Student;

@Transactional
@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	@Qualifier("sessionFactory")
    private SessionFactory sessionFactory;
	
	@Override
	public Student findStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudent() {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("daodaoodoaodoao");
		String hql = "from Student order by stuId asc";
		Query query = session.createQuery(hql);
		List<Student> studentList = query.list();
		
		return studentList;
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
