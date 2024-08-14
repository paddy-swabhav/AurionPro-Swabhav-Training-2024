package com.techlabs.model;

public class Admin {
	
	private int adminid;
	private String email;
	private String password;
	private String name;
	
	public Admin(int adminid, String email, String password, String name) {
		super();
		this.adminid = adminid;
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public int getAdminid() {
		return adminid;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
