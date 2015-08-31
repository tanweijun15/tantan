/**
 * Copyright (c) 2008-2015 by DHCC
 * All rights reserved.
 */
package com.dhcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="mailto:tanweijun@dhcc.com.cn">tanweijun</a>
 * @date 2015年8月28日
 */
@Entity
@Table(name = "tstudent")
public class Student {
	
	private int stuId;
	private String stuName;
	private String stuNo;
	private String stuSex;
	private String stuSpecialty;
	private String stuGrade;
	
	public Student() {}
	
	public Student(int stuId, String stuName, String stuNo, String stuSex, String stuSpecialty, String stuGrade) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuNo = stuNo;
		this.stuSex = stuSex;
		this.stuSpecialty = stuSpecialty;
		this.stuGrade = stuGrade;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "stuId", nullable = false, length = 10)
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	@Column(name = "stuName", nullable = false, length = 50)
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Column(name = "stuNo", nullable = false, unique = true, length = 20)
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	@Column(name = "stuSex", nullable = false, length = 2)
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	@Column(name = "stuSpecialty", nullable = false, length = 20)
	public String getStuSpecialty() {
		return stuSpecialty;
	}
	public void setStuSpecialty(String stuSpecialty) {
		this.stuSpecialty = stuSpecialty;
	}

	@Column(name = "stuGrade", nullable = false, length = 20)
	public String getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}
	
	
}
