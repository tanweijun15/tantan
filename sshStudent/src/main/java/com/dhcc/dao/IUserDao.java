/**
 * Copyright (c) 2008-2015 by DHCC
 * All rights reserved.
 */
package com.dhcc.dao;

import com.dhcc.model.User;

/**
 * @author <a href="mailto:tanweijun@dhcc.com.cn">tanweijun</a>
 * @date 2015年8月28日
 */
public interface IUserDao{
	boolean login(User user);
}
