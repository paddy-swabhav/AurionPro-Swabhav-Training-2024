package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerConnection {
	
	Connection connection;
	DatabaseConnection databaseConnection;
	private PreparedStatement preparedStatement= null;
	
	
	public void getCustomerDetails()
	{
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			preparedStatement = connection.prepareStatement("SELECT * FROM customers");
		
			ResultSet result = preparedStatement.executeQuery();
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
//			System.out.println("p.productid \tp.name\t p.description\t s.name");
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
