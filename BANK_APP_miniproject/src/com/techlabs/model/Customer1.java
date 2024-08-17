package com.techlabs.model;

public class Customer1 {
	private int customerid;
	private String firstName;
	private String lastName;
	private String email;
	private String Password;
	private Long accountnumber;
	private Double balance;
	
	public Customer1(int customerid, String firstName, String lastName, String email, String password, Long accountnumber, Double balance) {
		super();
		this.customerid = customerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.accountnumber = accountnumber;
		this.balance = balance;
		Password = password;
	}

	public Long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public int getCustomerid() {
		return customerid;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return Password;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
