package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDb {

	private Connection connection;
	Statement statement ;
	private static ConnectionDb connectionDb;

	private ConnectionDb()
	{
		
	}
	
	public static ConnectionDb getConnectionDb()
	{
		if(connectionDb==null)
			connectionDb = new ConnectionDb();
		
		return new ConnectionDb();
			
	}
	
	public void connectToDb()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb",username,password);
			System.out.println("Connection Successful");
			
			statement = connection.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // 1. REGISTER DRIVER
	}
	
	public ResultSet getAllDbUsers()
	{
		
		ResultSet dbusers = null;
		try {

			dbusers = statement.executeQuery("SELECT * FROM users");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbusers;
	}
	
	
	public boolean validateUser(String username, String password)
	{
		ResultSet users = getAllDbUsers();
		
			try {
				while(users.next())
				{
				if(users.getString("username").equals(username))
					if(users.getString("password").equals(password))
						return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}
}
