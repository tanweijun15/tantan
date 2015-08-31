/**
 * Copyright (c) 2008-2015 by DHCC
 * All rights reserved.
 */
package com.dhcc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.dao.IUserDao;
import com.dhcc.model.User;
import com.dhcc.service.IUserService;

/**
 * @author <a href="mailto:tanweijun@dhcc.com.cn">tanweijun</a>
 * @date 2015年8月28日
 */
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
