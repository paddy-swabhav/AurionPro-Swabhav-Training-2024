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

public class CustomerDatabaseConnection {

	private Connection connection=null;
	private PreparedStatement preparedStatement= null;
	private static CustomerDatabaseConnection databaseConnection = null;
	
	
	public CustomerDatabaseConnection() {
		
	}
	
	public static CustomerDatabaseConnection getConnectionToDb()
	{
		if(databaseConnection==null)
		{
			databaseConnection = new CustomerDatabaseConnection();
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
	
	public void addCustomer(String fname, String lname, String email, String password)
	{
		databaseConnection.connectToDatabase();
	
		try {
			
			preparedStatement = connection.prepareStatement("INSERT INTO customers (firstname, lastname, email, password) VALUES (?, ?, ?, ?);");
			preparedStatement.setString(1,fname);
			preparedStatement.setString(2,lname);
			preparedStatement.setString(3,email);
			preparedStatement.setString(4,password);
			
			preparedStatement.execute();
		
			System.out.println("CUSTOMER ADDED SUCCESSFULLY");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Customer getCustomer(int id) {
		System.out.println("IN FUNC");
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		Customer customer = null;
	
		try {
			
			preparedStatement = connection.prepareStatement("SELECT * FROM customers WHERE customerid=?");
			preparedStatement.setInt(1, id);
			
			result = preparedStatement.executeQuery();
			result.next();
				customer = new Customer(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}
	

	public void updateCustomer(int id, String fname, String lname, String password) {
	    connectToDatabase();

	    try {
	        preparedStatement = connection.prepareStatement("UPDATE customers SET firstname=?, lastname=?, password=? WHERE customerid=?");
	        preparedStatement.setString(1, fname);
	        preparedStatement.setString(2, lname);
	        preparedStatement.setString(3, password);
	        preparedStatement.setInt(4, id);

	        preparedStatement.executeUpdate();

	        System.out.println("CUSTOMER UPDATED SUCCESSFULLY");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


	

}
