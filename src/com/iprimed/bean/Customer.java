package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//creating table 
@Entity

public class Customer { //customer is table name
	
	@Id
	@GeneratedValue //incrementing id value
	private int id; //id is primary key
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Mobile")
	private long mobile;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	//constructors
	//no arg constructor
	public Customer() {}
	
	
	//parameterized constructor
	public Customer(String name,String email,long mobile)
	{
		this.name=name;
		this.email=email;
		this.mobile=mobile;
	}

}
