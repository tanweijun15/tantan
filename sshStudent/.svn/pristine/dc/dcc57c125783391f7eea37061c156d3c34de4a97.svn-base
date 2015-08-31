package com.dhcc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.dao.IUserDao;
import com.dhcc.model.User;
import com.dhcc.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public UserServiceImpl() {
	}
	
	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}

}
