package com.techlabs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Supplier {
	
	Scanner scanner = new Scanner(System.in);
	DbConnection dbconnection = new DbConnection();
	Connection connection = dbconnection.connectToDb();
	PreparedStatement preparedstatement= null;
	
	
	public void readSupplier()
	{
		try {
			preparedstatement = connection.prepareStatement("SELECT * FROM suppliers");
			
			ResultSet result = preparedstatement.executeQuery();
			
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("supplierid")+"\t"+result.getString("name")+"\t"+result.getString("Contactinfo")+"\t"+result.getString("Address"));
					
				}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertSupplier()
	{
		try {
			preparedstatement = connection.prepareStatement("INSERT INTO suppliers (`Supplierid`, `name`, `ContactInfo`, `Address`) VALUES (?,?,?,?);");
			
			System.out.println("Enter 1.Supplier ID\t2. Supplier Name\t3. Contact\t4. Address");
			int supplierid = scanner.nextInt();
			scanner.nextLine();
			String name = scanner.nextLine();
			String contact = scanner.nextLine();
			String address = scanner.nextLine();
			
			preparedstatement.setInt(1,supplierid);		
			preparedstatement.setString(2, name);
			preparedstatement.setString(3, contact);
			preparedstatement.setString(4, address);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateSupplier()
	{
		try {
			preparedstatement = connection.prepareStatement("UPDATE suppliers SET name=?, ContactInfo=?, Address=?  WHERE supplierid=?;");
			
			System.out.println("Enter 1.Supplier ID OF THE SUPPLIER WHOSE DATA YOU WANT TO UPDATE \n\t2. Supplier Name\t3. Contact\t4. Address");
			int supplierid = scanner.nextInt();
			scanner.nextLine();
			String name = scanner.nextLine();
			String contact = scanner.nextLine();
			String address = scanner.nextLine();
			
			preparedstatement.setInt(4,supplierid);		
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, contact);
			preparedstatement.setString(3, address);
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteSupplier()
	{
		try {
			preparedstatement = connection.prepareStatement("DELETE FROM suppliers WHERE supplierid=?;");
			
			System.out.println("Enter 1.Supplier ID OF THE SUPPLIER WHOSE DATA YOU WANT TO DELETE");
			int supplierid = scanner.nextInt();
			
			preparedstatement.setInt(1,supplierid);		
			
			
			preparedstatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
