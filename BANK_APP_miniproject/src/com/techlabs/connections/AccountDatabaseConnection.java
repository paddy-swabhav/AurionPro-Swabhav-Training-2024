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

public class AccountDatabaseConnection {
	
	private Scanner scanner = new Scanner(System.in);
	private Connection connection=null;
	private PreparedStatement preparedStatement= null;
	private static AccountDatabaseConnection databaseConnection = null;
	
	
	public AccountDatabaseConnection()
	{
		
	}
	
	public static AccountDatabaseConnection getConnectionToDb()
	{
		if(databaseConnection==null)
		{
			databaseConnection = new AccountDatabaseConnection();
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

	public void generateAccountNumber(int id, double balance)
	{
		connectToDatabase();
		long accountNumber = randomNumberGenerator();
		ResultSet result = null;
	
		try {
			
			preparedStatement = connection.prepareStatement("SELECT accountnumber FROM accounts");
			System.out.println("account number fetched");
			result = preparedStatement.executeQuery();
		
			if(!result.isBeforeFirst())
			{
			while(result.next())
				{
					System.out.println("inside loop");
					if(accountNumber==result.getLong(1))
					accountNumber = randomNumberGenerator();
					
					break;
				}
			}
			
			preparedStatement = connection.prepareStatement("INSERT INTO accounts (accountnumber, balance, customerid) VALUES(?,?,?)");
			preparedStatement.setLong(1, accountNumber);
			preparedStatement.setDouble(2, balance);
			preparedStatement.setInt(3, id);
			
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public long randomNumberGenerator()
	{
		// Define the range for a 12-digit number
        long min = 100000000000L; // 12-digit minimum value
        long max = 999999999999L; // 12-digit maximum value

        // Generate a random number within the range
        long accountNumber = (long) (Math.random() * (max - min + 1)) + min;
        
        return accountNumber;
	}
}
