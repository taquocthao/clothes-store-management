package com.tathao.shop.bean;

public class AccountRole {

	private int id;
	private int accountId;
	private int roleId;
	
	public AccountRole(int id, int accountId, int roleId) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.roleId = roleId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
