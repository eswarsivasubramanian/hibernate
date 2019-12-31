package com.iprimed.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	private double salary;
	
	
	@OneToOne(cascade=CascadeType.ALL , fetch=FetchType.LAZY) //uni directional
	@JoinColumn(name="emp_dept")
	private Department department;
	

	//no-arg constructor
	public Emp() {}
	
	//constructors
	public Emp(int empId, String empName, double salary,Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department=department;
	}
	
	//getters and setters
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
