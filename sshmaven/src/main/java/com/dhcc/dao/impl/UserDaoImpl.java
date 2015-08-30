package com.dhcc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhcc.dao.IUserDao;

@Repository("userDao")
public class UserDaoImpl<T> implements IUserDao<T> {
	//注入sessionfactory
	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(T o) {
		return true;
	}

}
