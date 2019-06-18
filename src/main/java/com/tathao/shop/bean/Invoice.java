package com.tathao.shop.bean;

import java.util.Date;

public class Invoice {

	private int id;
	private Date creationDateTime;
	private int accountId;
	private int personId;
	private double totalPrices;
	
	public Invoice(int id, Date creationDateTime, int accountId, int personId, double totalPrices) {
		super();
		this.id = id;
		this.creationDateTime = creationDateTime;
		this.accountId = accountId;
		this.personId = personId;
		this.totalPrices = totalPrices;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public double getTotalPrices() {
		return totalPrices;
	}

	public void setTotalPrices(double totalPrices) {
		this.totalPrices = totalPrices;
	}
	
}
