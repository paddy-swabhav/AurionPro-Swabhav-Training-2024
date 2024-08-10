package com.techlabs.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Orders {

	Scanner scanner = new Scanner(System.in);
	DbConnection dbconnection = new DbConnection();
	Connection connection = dbconnection.connectToDb();
	PreparedStatement preparedstatement= null;
	
	
	public void readOrders()
	{
		try {
			preparedstatement = connection.prepareStatement("SELECT * FROM orders");
			
			ResultSet result = preparedstatement.executeQuery();
			
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("orderid")+"\t"+result.getDate("orderdate")+"\t"+result.getInt("supplierid"));
					
				}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertOrder()
	{
		try {
			preparedstatement = connection.prepareStatement("INSERT INTO orders (`orderid`, `orderdate`, `supplierid`) VALUES (?,?,?);");
			
			System.out.println("Enter 1.Order Id ID\t2. Order Date(YYYY-MM-DD)\t3. Supplier Id");
			int orderid = scanner.nextInt();
			scanner.nextLine();
			String Date = scanner.nextLine();
			int supplierid = scanner.nextInt();
			
			preparedstatement.setInt(1,orderid);		
			preparedstatement.setString(2, Date);
			preparedstatement.setInt(3, supplierid);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOrder()
	{
		try {
			preparedstatement = connection.prepareStatement("UPDATE orders SET orderdate=?, supplierid=?  WHERE orderid=?;");
			
			System.out.println("Enter 1.ORDER ID OF THE ORDER WHOSE DATA YOU WANT TO UPDATE \n\t2. Order Date(YYYY-MM-DD)\t3. Supplier Id");
			int orderid = scanner.nextInt();
			scanner.nextLine();
			String Date = scanner.nextLine();
			int supplierid = scanner.nextInt();
			
			preparedstatement.setInt(3,orderid);		
			preparedstatement.setString(2, Date);
			preparedstatement.setInt(1, supplierid);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOrder()
	{
		try {
			preparedstatement = connection.prepareStatement("DELETE FROM orders WHERE orderid=?;");
			
			System.out.println("Enter 1.ORDER ID OF THE ORDER WHOSE DATA YOU WANT TO DELETE");
			int orderid = scanner.nextInt();
			
			preparedstatement.setInt(1,orderid);		
			
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
