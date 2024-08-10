package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	private Scanner scanner = new Scanner(System.in);
	private Connection connection=null;
	private Statement statement=null;	
	private PreparedStatement preparedStatement= null;
	
	public Connection connectToDb()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   // 1. REGISTER DRIVER
			
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplychainmanagement",username,password);
			
			statement = connection.createStatement();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("CONNECTION SUCCESSFUL");
		return connection;
	}
	
	//Question 1
	public void List_all_products_along_with_their_supplier_names()
	{
		try {
			preparedStatement = connection.prepareStatement("SELECT P.PRODUCTID,P.NAME,P.DESCRIPTION, S.NAME FROM \r\n" + 
															 "PRODUCTS P LEFT JOIN \r\n" + 
															 "SUPPLIERS S ON P.SUPPLIERID=S.SUPPLIERID");
		
			ResultSet result = preparedStatement.executeQuery();
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
//			System.out.println("p.productid \tp.name\t p.description\t s.name");
			while(result.next())
				{
					System.out.println(result.getInt("p.productid")+"\t"+result.getString("p.name")+"\t"+result.getString("p.description")+"\t"+result.getString("s.name"));
					
				}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	//Question 2
	public void Get_all_orders_with_their_details_including_product_names_and_quantities()
	{
		try {
			preparedStatement = connection.prepareStatement("SELECT O.ORDERID,O.ORDERDATE,O.SUPPLIERID,P.NAME,OD.QUANTITY, OD.PRICE FROM \r\n" + 
															"ORDERS O JOIN \r\n" + 
															"ORDERDETAILS OD ON O.ORDERID = OD.ORDERID LEFT JOIN \r\n" + 
															"PRODUCTS P ON OD.PRODUCTID = P.PRODUCTID;");
		
			ResultSet result = preparedStatement.executeQuery();
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("O.ORDERID")+"\t"+result.getDate("O.ORDERDATE")+"\t"+result.getInt("O.SUPPLIERID")+"\t"+result.getString("P.NAME")+"\t"+result.getInt("OD.QUANTITY")+"\t"+result.getDouble("OD.Price"));
					
				}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	//Question 3
	public void Find_all_suppliers_who_have_supplied_a_specific_product()
	{
		try {
			
			System.out.println("ENTER PRODUCT ID: ");
			int productid = scanner.nextInt();
			
			preparedStatement = connection.prepareStatement("SELECT S.supplierid, S.name, S.contactinfo FROM\r\n" + 
															"SUPPLIERS S JOIN \r\n" + 
															"PRODUCTS P ON P.supplierid = S.supplierid\r\n" + 
															"WHERE P.productid=?;");
			preparedStatement.setInt(1, productid);
		
			ResultSet result = preparedStatement.executeQuery();
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("S.supplierid")+"\t"+result.getString("S.name")+"\t"+result.getString("S.contactinfo"));
					
				}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	
	//Question 4
	public void List_all_products_and_their_current_inventory_levels()
	{
		try {
			preparedStatement = connection.prepareStatement("SELECT P.productid, P.name, P.description, P.supplierid, I.quantityonhand FROM \r\n" + 
															"PRODUCTS P JOIN\r\n" + 
															"INVENTORY I ON P.productid = I.productid;");
		
			ResultSet result = preparedStatement.executeQuery();
			if(!result.isBeforeFirst())
			{
				System.out.println("NO RESULT FOUND");
				return;
			}
			while(result.next())
				{
					System.out.println(result.getInt("P.productid")+"\t"+result.getString("P.name")+"\t"+result.getString("P.description")+"\t"+result.getInt("P.supplierid")+"\t"+result.getInt("I.quantityonhand"));
					
				}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	//Question 5
		public void Find_all_orders_placed_within_the_last_month()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT *\r\n" + 
																"FROM Orders\r\n" + 
																"WHERE OrderDate >= CURDATE() - INTERVAL 1 MONTH;");
			
				ResultSet result = preparedStatement.executeQuery();
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
		
		
		//Question 6
		public void Gettotalquantityorderedforeachproduct()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT P.productid, P.name, SUM(OD.QUANTITY) AS totalquantity \r\n" + 
																"FROM ORDERDETAILS OD\r\n" + 
																"JOIN PRODUCTS P ON OD.productid =  P.productid\r\n" + 
																"GROUP BY P.ProductID, P.Name;");
			
				ResultSet result = preparedStatement.executeQuery();
				if(!result.isBeforeFirst())
				{
					System.out.println("NO RESULT FOUND");
					return;
				}
				while(result.next())
					{
						System.out.println(result.getInt("P.productid")+"\t"+result.getString("P.name")+"\t"+result.getInt("totalquantity"));
						
					}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
		
		//Question 7
		public void Retrieveallordersalongwiththetotalamountspentforeachorder()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT OD.orderid,OD.quantity,OD.price, SUM(OD.quantity*OD.price) AS totalamount\r\n" + 
																"FROM ORDERDETAILS OD\r\n" + 
																"JOIN ORDERS O ON OD.orderid = O.orderid\r\n" + 
																"GROUP BY orderid\r\n" + 
																"ORDER BY orderid;");
			
				ResultSet result = preparedStatement.executeQuery();
				if(!result.isBeforeFirst())
				{
					System.out.println("NO RESULT FOUND");
					return;
				}
				while(result.next())
					{
						System.out.println(result.getInt("OD.orderid")+"\t"+result.getInt("OD.quantity")+"\t"+result.getInt("OD.price")+"\t"+result.getInt("totalamount"));
						
					}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
		
		
		//Question 8
		public void Findproductssuppliedbymorethanonesupplier()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT p.ProductID, p.Name\r\n" + 
																"FROM Products p\r\n" + 
																"GROUP BY p.ProductID, p.Name\r\n" + 
																"HAVING COUNT(DISTINCT p.SupplierID) > 1;");
			
				ResultSet result = preparedStatement.executeQuery();
				if(!result.isBeforeFirst())
				{
					System.out.println("NO RESULT FOUND");
					return;
				}
				while(result.next())
					{
						System.out.println(result.getInt("p.productid")+"\t"+result.getString("p.name"));
						
					}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
		
		
		//Question 9
		public void Gettheaverageinventorylevelforeachproduct()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT p.Name AS ProductName, (i.QuantityOnHand)/(count(i.ProductID)) AS AverageQuantityOnHand\r\n" + 
																"FROM Products p\r\n" + 
																"JOIN Inventory i ON p.ProductID = i.ProductID\r\n" + 
																"GROUP BY p.ProductID, p.Name;");
			
				ResultSet result = preparedStatement.executeQuery();
			
				if(!result.isBeforeFirst())
				{
					System.out.println("NO RESULT FOUND");
					return;
				}
				while(result.next())
					{
						System.out.println(result.getString("ProductName")+"\t"+result.getDouble("AverageQuantityOnHand"));
						
					}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		
		//Question 10
		public void Listsupplierswhohavenotsuppliedanyproducts()
		{
			try {
				preparedStatement = connection.prepareStatement("SELECT s.SupplierID, s.Name\r\n" + 
																"FROM Suppliers s\r\n" + 
																"LEFT JOIN Products p ON s.SupplierID = p.SupplierID\r\n" + 
																"WHERE p.SupplierID IS NULL;");
			
				ResultSet result = preparedStatement.executeQuery();
				if(!result.isBeforeFirst())
				{
					System.out.println("NO RESULT FOUND");
					return;
				}
				while(result.next())
					{
						System.out.println(result.getInt("s.supplierID")+"\t"+result.getString("s.Name"));
						
					}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
		
}