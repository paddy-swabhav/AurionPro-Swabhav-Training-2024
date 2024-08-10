package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//CREATE CONNECTION
		String username = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb",username,password);
		System.out.println("Connection Successful");
		
//		statement = connection.createStatement();
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
