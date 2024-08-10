package com.techlabs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Products {

	Scanner scanner = new Scanner(System.in);
	DbConnection dbconnection = new DbConnection();
	Connection connection = dbconnection.connectToDb();
	PreparedStatement preparedstatement= null;
	
	
	public void readProducts()
	{
		try {
			preparedstatement = connection.prepareStatement("SELECT * FROM products");
			
			ResultSet result = preparedstatement.executeQuery();
			
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("productid")+"\t"+result.getString("name")+"\t"+result.getString("description")+"\t"+result.getInt("supplierid"));
					
				}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertProduct()
	{
		try {
			preparedstatement = connection.prepareStatement("INSERT INTO products (`productid`, `name`, `description`, `supplierid`) VALUES (?,?,?,?);");
			
			System.out.println("Enter 1.Product Id ID\t2. Product Name\t3. Description\t4. Supplier Id");
			int productid = scanner.nextInt();
			scanner.nextLine();
			String name = scanner.nextLine();
			String description = scanner.nextLine();
			int supplierid = scanner.nextInt();
			
			preparedstatement.setInt(1,productid);		
			preparedstatement.setString(2, name);
			preparedstatement.setString(3, description);
			preparedstatement.setInt(4, supplierid);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateProduct()
	{
		try {
			preparedstatement = connection.prepareStatement("UPDATE products SET name=?, description=?, supplierid=?  WHERE productid=?;");
			
			System.out.println("Enter 1.PRODUCT ID OF THE PRODUCT WHOSE DATA YOU WANT TO UPDATE \n\t2. Product Name\t3. Description\t4. Supplier Id");
			int productid = scanner.nextInt();
			scanner.nextLine();
			String name = scanner.nextLine();
			String description = scanner.nextLine();
			int supplierid = scanner.nextInt();
			
			preparedstatement.setInt(4,productid);		
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, description);
			preparedstatement.setInt(3, supplierid);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteProduct()
	{
		try {
			preparedstatement = connection.prepareStatement("DELETE FROM products WHERE productid=?;");
			
			System.out.println("Enter 1.PRODUCT ID OF THE PRODUCT WHOSE DATA YOU WANT TO DELETE");
			int productid = scanner.nextInt();
			
			preparedstatement.setInt(1,productid);		
			
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
