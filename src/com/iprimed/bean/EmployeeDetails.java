package com.iprimed.bean;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeDetails {
	
	private int age; 
	private String address;
	
	//constructor
	public EmployeeDetails(int age, String address) {
		super();
		this.age = age;
		this.address = address;
	}
	
	public EmployeeDetails() {}
	
	//getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
