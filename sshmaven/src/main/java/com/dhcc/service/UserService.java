package com.dhcc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.dao.IUserDao;
import com.dhcc.model.User;

@Service("userService")
@Transactional
public class UserService
{ 	
	//自动注入dao
	@Autowired
	private IUserDao<User> userDao;
	public void addUser(User user)
	{
		
		userDao.save(user);
	}

}