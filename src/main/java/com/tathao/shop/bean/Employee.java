package com.tathao.shop.bean;

import java.util.Date;

public class Employee {
	
	private int personId;
	private Date dayToWork;
	private double salary;
	
	public Employee(int personId, Date dayToWork, double salary) {
		super();
		this.personId = personId;
		this.dayToWork = dayToWork;
		this.salary = salary;
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public Date getDayToWork() {
		return dayToWork;
	}
	public void setDayToWork(Date dayToWork) {
		this.dayToWork = dayToWork;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
