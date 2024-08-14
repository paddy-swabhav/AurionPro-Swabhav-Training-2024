package com.techlabs.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.model.Customer1;

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
	
	public List<Customer1> getCustomerDetailsForAdmin()
	{
		databaseConnection.connectToDatabase();
		ResultSet result = null;
		List<Customer1> customers = new ArrayList<Customer1>();
	
		try {
			
			preparedStatement = connection.prepareStatement("SELECT c.customerid, c.firstname, c.lastname, c.email,c.password, a.accountnumber, a.balance\r\n" + 
					"FROM customers c\r\n" + 
					"LEFT JOIN accounts a ON c.customerid = a.customerid");
			
			result = preparedStatement.executeQuery();
		
			while(result.next())
			{
				customers.add((new Customer1(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getLong(6),result.getDouble(7))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}
	
	public List<Customer1> searchCustomersForAdmin(String searchQuery) {
	    connectToDatabase();
	    List<Customer1> customers = new ArrayList<>();
	    String query = "SELECT c.customerid, c.firstname, c.lastname, c.email, c.password, a.accountnumber, a.balance " +
	                   "FROM customers c " +
	                   "LEFT JOIN accounts a ON c.customerid = a.customerid " +
	                   "WHERE c.firstname LIKE ? " +
	                   "OR c.lastname LIKE ? " +
	                   "OR c.email LIKE ? " +
	                   "OR CAST(c.customerid AS CHAR) LIKE ? " +
	                   "OR CAST(a.accountnumber AS CHAR) LIKE ? " +
	                   "OR CAST(a.balance AS CHAR) LIKE ?";

	    try (PreparedStatement stmt = connection.prepareStatement(query)) {
	        String pattern = searchQuery + "%";
	        stmt.setString(1, pattern);
	        stmt.setString(2, pattern);
	        stmt.setString(3, pattern);
	        stmt.setString(4, searchQuery);
	        stmt.setString(5, searchQuery);
	        stmt.setString(6, searchQuery);

	        ResultSet rs = stmt.executeQuery();
	        while (rs.next()) {
	            customers.add(new Customer1(
	                rs.getInt("customerid"),
	                rs.getString("firstname"),
	                rs.getString("lastname"),
	                rs.getString("email"),
	                rs.getString("password"),
	                rs.getLong("accountnumber"),
	                rs.getDouble("balance")
	            ));
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
