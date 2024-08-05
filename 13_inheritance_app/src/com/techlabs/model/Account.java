package com.techlabs.model;

public class Account {
	private long account_number;
	private String name;
	private double balance;
	public Account(long account_number, String name, double balance) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
