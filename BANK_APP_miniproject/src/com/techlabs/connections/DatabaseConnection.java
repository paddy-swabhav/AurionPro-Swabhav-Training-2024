package com.techlabs.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Customer;

public class DatabaseConnection {
	private Scanner scanner = new Scanner(System.in);
	private Connection connection=null;
	private PreparedStatement preparedStatement= null;
	private static DatabaseConnection databaseConnection = null;
	
	
	
	
	public DatabaseConnection() {
		
	}
	
	public static DatabaseConnection getConnectionToDb()
	{
		if(databaseConnection==null)
		{
			databaseConnection = new DatabaseConnection();
		}
		return  databaseConnection;
	}




	public void connectToDatabase()
	{
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",username,password);
			System.out.println("Connection Successful");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
	}
	
	
	public List<Customer> getCustomerDetails()
	{
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		List<Customer> customers = new ArrayList<Customer>();
	
		try {
			
			preparedStatement = connection.prepareStatement("SELECT * FROM customers");
			
			result = preparedStatement.executeQuery();
		
			while(result.next())
			{
				customers.add((new Customer(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}

}
