package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NewStudent {
	
	@Id
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="student_name")
	private String Name;
	
	//column to have reference to access college details
	@ManyToOne
	@JoinColumn(name="college_id")
	private College college;
	
	//constructors
	public NewStudent() {}
	
	public NewStudent(int rollNo, String name, College college) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.college = college;
	}
	
	
	//getters and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	//getter and setter for college
			public College getCollege() {
				return college;
			}
			public void setCollege(College college) {
				this.college = college;
			}
}
