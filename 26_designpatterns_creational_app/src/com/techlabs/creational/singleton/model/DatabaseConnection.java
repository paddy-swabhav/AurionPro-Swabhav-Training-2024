package com.techlabs.creational.singleton.model;

public class DatabaseConnection {
	
	private String userid;
	private String password;
	private static DatabaseConnection connection;
	
	public DatabaseConnection() {
		super();
		this.userid = userid;
		this.password = password;

	}
	
	public static DatabaseConnection getConnection()
	{
		if(connection==null)
		connection = new DatabaseConnection();
		return connection;
		
	}
	
	public void status()
	{
		System.out.println("CONNECTION Successful");
	}
	

}
