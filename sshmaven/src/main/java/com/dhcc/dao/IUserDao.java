package com.dhcc.dao;

public interface IUserDao<T>
{
	public boolean save(T o);
}
