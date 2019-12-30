package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="student")
@SecondaryTable(name="student_details") //create one more table

public class Student {
	
	@Id
	@GeneratedValue
	private int rollno;
	
	@Column(name="student_name")
	private String stuName;
	
	@Column(table="student_details") //age will be inserted
	private int age;
	
	@Column(table="student_details")
	private String schoolName;
	
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//constructors
	public Student(String stuName, int rollno, int age)
	{
		super();
		this.stuName = stuName;
		this.rollno = rollno;
		this.age = age;
	}
	
	public Student() {}
	
	
	//getters and setters
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
