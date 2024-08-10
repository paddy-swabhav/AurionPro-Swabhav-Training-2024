package com.techlabs.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.entity.Student;

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
	
	void connectToDb()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb",username,password);
			System.out.println("Connection Successful");
			
			statement = connection.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // 1. REGISTER DRIVER
	}
	
	public List<Student> getAllStudents()
	{
		
		ResultSet dbusers = null;
		List<Student> students = new ArrayList<Student>();
		try {

			dbusers = statement.executeQuery("SELECT * FROM students");
			while(dbusers.next())
			{
				students.add(new Student(dbusers.getInt(1),dbusers.getString(2),dbusers.getDouble(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
	
	
//	public boolean validateUser(String username, String password)
//	{
//		 = getAllStudents();
//		
//			try {
//				while(users.next())
//				{
//				if(users.getString("username").equals(username))
//					if(users.getString("password").equals(password))
//						return true;
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		return false;
//	}
}
