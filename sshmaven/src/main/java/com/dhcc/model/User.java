package com.dhcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//关闭类或方法级别的编译器警告
//@SuppressWarnings("serial")
@Entity
@Table(name = "tuser")
public class User{
	
	private int uid;
	private String username;
	private String password;
	
	public User(){}
	
	public User(int uid, String username,String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "uid", nullable = false, length = 10)
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	@Column(name="password",nullable=false,length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//@Temporal(TemporalType.TIMESTAMP)显示日期与时间
	//@Transient @Transient表示该属性并非一个到数据库表的字段的映射,ORM框架将忽略该属性.
	
	@Column(name = "username", unique = false, nullable = false, length = 50)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}