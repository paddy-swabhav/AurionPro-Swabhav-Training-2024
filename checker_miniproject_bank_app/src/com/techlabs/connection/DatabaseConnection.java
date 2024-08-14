package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseConnection {

	private Scanner scanner = new Scanner(System.in);
	private Connection connection=null;
	private Statement statement=null;	
	private PreparedStatement preparedStatement= null;
	
	public void connectToDb()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   // 1. REGISTER DRIVER
			
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",username,password);
			
			statement = connection.createStatement();
		
			System.out.println("CONNECTION SUCCESSFUL");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
		public void getCustomerDetails()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT * FROM customers");
			
				ResultSet result = preparedStatement.executeQuery();
				if(!result.isBeforeFirst())
				{
					System.out.println("NO RESULT FOUND");
					return;
				}
//				System.out.println("p.productid \tp.name\t p.description\t s.name");
				while(result.next())
					{
						System.out.println(result.getInt("customerid")+"\t"+result.getString("firstname")+"\t"+result.getString("lastname")+"\t"+result.getString("email")+"\t"+result.getString("password"));
						
					}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
	
}
