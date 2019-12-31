package com.iprimed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Event {
	
	@Id
	@Column(name="event_id")
	private int eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	@ManyToMany
	@JoinTable(name="JOIN_DELEGATE_EVENT",
	joinColumns= {@JoinColumn(name="eventId")},
	inverseJoinColumns= {@JoinColumn(name="delegateId")})
	
	private List<Delegate> delegate = new ArrayList<Delegate>();
	
	//constructors
	public Event(int eventId, String eventName, List<Delegate> delegate) {
		//super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.delegate = delegate;
	}
	
	public Event() {}
	
	//getters and setters
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	//getters and setters for list
	public List<Delegate> getDelegate() {
		return delegate;
	}
	public void setDelegate(List<Delegate> delegate) {
		this.delegate = delegate;
	}
}
