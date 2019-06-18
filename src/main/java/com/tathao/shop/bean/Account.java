package com.tathao.shop.bean;

public class Account {

	private int id;
	private int personId;
	private String username;
	private String password;
	
	public Account(int id, int personId, String username, String password) {
		super();
		this.id = id;
		this.personId = personId;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
