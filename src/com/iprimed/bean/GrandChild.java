package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class GrandChild  extends Child{
	
	@Column(name="grand_child_id")
	private int grandchildId;
	
	@Column(name="grand_child_name")
	private String grandchildName;
	
	//no-arg constructor
	public GrandChild() {}
	
	//constructor
	public GrandChild(int grandchildId, String grandchildName) {
		//super(childId, childName);
		this.grandchildId = grandchildId;
		this.grandchildName = grandchildName;
	}

	//getters and setters
	public int getGrandchildId() {
		return grandchildId;
	}

	public void setGrandchildId(int grandchildId) {
		this.grandchildId = grandchildId;
	}

	public String getGrandchildName() {
		return grandchildName;
	}

	public void setGrandchildName(String grandchildName) {
		this.grandchildName = grandchildName;
	}
}
