package com.techlabs.connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;

public class CustomerDb {

	private Connection connection;
	DatabaseConnection databaseConnection = DatabaseConnection.getConnectionToDb();
	Statement statement;
	
	public List<Customer> getCustomerDetails()
	{
		System.out.println("1");
		ResultSet set = null;
		System.out.println("2");
		List<Customer> customers = new ArrayList<Customer>();
		System.out.println("3");
		try {
			
			set = statement.executeQuery("SELECT * FROM customers");
			System.out.println("after query");
			while(set.next())
			{
				customers.add((new Customer(set.getInt(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}
	
}
