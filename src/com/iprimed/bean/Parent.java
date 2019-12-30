package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="parent")
@Inheritance(strategy=InheritanceType.JOINED)

public class Parent {
	@Id
	@Column(name="parent_id")
	private int parentId;
	
	@Column(name="parent_name")
	private String parentName;
	
	//no-arg constructor
	public Parent() {}
	
	//constructors
	public Parent(int parentId, String parentName) {
		this.parentId = parentId;
		this.parentName = parentName;
	}

	//getters and setters
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
