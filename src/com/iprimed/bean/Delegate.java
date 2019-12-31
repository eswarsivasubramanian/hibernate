package com.iprimed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {
	
	@Id
	@Column(name="delegate_id")
	private int delegateId;
	
	@Column(name="delegate_name")
	private String delegateName;
	
	@ManyToMany
	@JoinTable(name="JOIN_DELEGATE_EVENT",
	joinColumns= {@JoinColumn(name="delegateId")},
	inverseJoinColumns= {@JoinColumn(name="eventId")})
	
	private List<Event> event = new ArrayList<Event>();
	
	//constructors
	
	public Delegate() {}
	
	public Delegate(int delegateId, String delegateName, List<Event> event) {
		super();
		this.delegateId = delegateId;
		this.delegateName = delegateName;
		this.event = event;
	}

	//getters and setters
	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}

	//getters and setters for list
	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}
	
	
}
