package com.iprimed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class College {
	
	@Id
	@Column(name="college_id")
	private int collegeId;
	
	@Column(name="college_name")
	private String collegeName;
	
	@OneToMany(targetEntity=NewStudent.class,
			mappedBy="college",
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	private List<NewStudent> student = new ArrayList<NewStudent>();
	//private NewStudent newstudent;
	
	

	//constructor
	public College(int collegeId, String collegeName, List<NewStudent> student) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.student = student;
	}
	
	public College() {}
	
	//getters and setters
	public int getCollegeId() {
		return collegeId;
	}
	
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	//getter and setter for newstudent
	public List<NewStudent> getStudent() {
		return student;
	}
	public void setStudent(List<NewStudent> student) {
		this.student = student;
	}
}
