package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Child extends Parent{
	
	@Column(name="child_id")
	private int childId;
	
	@Column(name="child_name")
	private String childName;
	
	//constructors
	
	public Child(int childId, String childName) {
		this.childId = childId;
		this.childName = childName;
	}
	
	//no-arg constructor
	public Child() {}

	//getters and setters
	
	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
}
