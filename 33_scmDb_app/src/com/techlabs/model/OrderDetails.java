package com.techlabs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderDetails {

	Scanner scanner = new Scanner(System.in);
	DbConnection dbconnection = new DbConnection();
	Connection connection = dbconnection.connectToDb();
	PreparedStatement preparedstatement= null;
	
	
	public void readOrderDetails()
	{
		try {
			preparedstatement = connection.prepareStatement("SELECT * FROM orderdetails	");
			
			ResultSet result = preparedstatement.executeQuery();
			
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("orderdetailid")+"\t"+result.getInt("orderid")+"\t"+result.getInt("productid")+"\t"+result.getInt("quantity")+"\t"+result.getInt("price"));
					
				}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertOrderDetials()
	{
		try {
			preparedstatement = connection.prepareStatement("INSERT INTO orderdetails (`orderdetailid`, `orderid`, `productid`, `quantity`,'price') VALUES (?,?,?,?,?);");
			
			System.out.println("Enter 1.ORDER DETAIL ID\t2. ORDER ID\t3. PRODUCT ID\t4. QUANTITY\t5. PRICE");
			int orderdetailid = scanner.nextInt();
			int orderid = scanner.nextInt();
			int productid = scanner.nextInt();
			int quantity = scanner.nextInt();
			int price = scanner.nextInt();
			
			preparedstatement.setInt(1,orderdetailid);		
			preparedstatement.setInt(2, orderid);
			preparedstatement.setInt(3, productid);
			preparedstatement.setInt(4, quantity);
			preparedstatement.setInt(5, price);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateSupplier()
	{
		try {
			preparedstatement = connection.prepareStatement("UPDATE orderdetails SET orderid=?, productid=?, quantity=?, price=?  WHERE orderdetailid=?;");
			
			System.out.println("Enter 1.ORDER DETAIL ID OF THE ORDER DETAIL WHOSE DATA YOU WANT TO UPDATE \n\t2. ORDER ID\t3. PRODUCT ID\t4. QUANTITY\t5. PRICE");
			int orderdetailid = scanner.nextInt();
			int orderid = scanner.nextInt();
			int productid = scanner.nextInt();
			int quantity = scanner.nextInt();
			int price = scanner.nextInt();
			
			preparedstatement.setInt(5,orderdetailid);		
			preparedstatement.setInt(1, orderid);
			preparedstatement.setInt(2, productid);
			preparedstatement.setInt(3, quantity);
			preparedstatement.setInt(4, price);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteSupplier()
	{
		try {
			preparedstatement = connection.prepareStatement("DELETE FROM orderdetails WHERE orderdetailid=?;");
			
			System.out.println("Enter 1.ORDER DETAIL ID OF THE ORDER DETAIL WHOSE DATA YOU WANT TO DELETE");
			int orderdetailid = scanner.nextInt();
			
			preparedstatement.setInt(1,orderdetailid);		
			
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
