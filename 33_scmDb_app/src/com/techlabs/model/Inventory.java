package com.techlabs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Inventory {

	Scanner scanner = new Scanner(System.in);
	DbConnection dbconnection = new DbConnection();
	Connection connection = dbconnection.connectToDb();
	PreparedStatement preparedstatement= null;
	
	
	public void readInventory()
	{
		try {
			preparedstatement = connection.prepareStatement("SELECT * FROM inventory");
			
			ResultSet result = preparedstatement.executeQuery();
			
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("inventoryid")+"\t"+result.getInt("productid")+"\t"+result.getInt("quantityonhand"));
					
				}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertInventory()
	{
		try {
			preparedstatement = connection.prepareStatement("INSERT INTO inventory (`inventoryid`, `productid`, `quantityonhand`) VALUES (?,?,?);");
			
			System.out.println("Enter 1.Inventory Id ID\t2. Product Id\t3. Quantity On Hand");
			int inventoryid = scanner.nextInt();
			scanner.nextLine();
			int productid = scanner.nextInt();
			int quantityonhand = scanner.nextInt();
			
			preparedstatement.setInt(1,inventoryid);		
			preparedstatement.setInt(2, productid);
			preparedstatement.setInt(3, quantityonhand);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateInventory()
	{
		try {
			preparedstatement = connection.prepareStatement("UPDATE inventory SET productid=?, quantityonhand=?  WHERE inventoryid=?;");
			
			System.out.println("Enter 1.INVENTORY ID OF THE INVENTORY WHOSE DATA YOU WANT TO UPDATE \n\t2. Product Id\t3. Quantity On Hand");
			int inventoryid = scanner.nextInt();
			scanner.nextLine();
			int productid = scanner.nextInt();
			int quantityonhand = scanner.nextInt();
			
			preparedstatement.setInt(3,inventoryid);		
			preparedstatement.setInt(2, productid);
			preparedstatement.setInt(1, quantityonhand);
			
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteInventory()
	{
		try {
			preparedstatement = connection.prepareStatement("DELETE FROM Inventory WHERE inventoryid=?;");
			
			System.out.println("Enter 1.INVENTORY ID OF THE INVENTORY WHOSE DATA YOU WANT TO DELETE");
			int inventoryid = scanner.nextInt();
			
			preparedstatement.setInt(1,inventoryid);		
			
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
