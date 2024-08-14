package com.techlabs.model;

public class Customer {
	private int customerid;
	private String firstName;
	private String lastName;
	private String email;
	private String Password;
	
	public Customer(int customerid, String firstName, String lastName, String email, String password) {
		super();
		this.customerid = customerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Password = password;
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
