package com.iprimed.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	
	private int empId;
	private String name;
	private double salary;
	
	@Embedded //importing another class
	private EmployeeDetails empDetails;
	
	//constructors
	
	public Employee(int empId, String name, double salary,EmployeeDetails empDetails) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.empDetails=empDetails;
	}
	
	public Employee() {}
	
	//getter and setter methods
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}
}
