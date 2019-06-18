package com.tathao.shop.bean;

import java.util.Date;

public class User {

	private int personId;
	private Date creationDateTime;
	
	public User(int personId, Date creationDateTime) {
		super();
		this.personId = personId;
		this.creationDateTime = creationDateTime;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Date getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
	
}
