package com.techlabs.model;

import java.util.Scanner;

public class ScmFacade {
	
	DbConnection connection = new DbConnection();

	
	Scanner scanner = new Scanner(System.in);
	
	public void mainMenu()
	{
		System.out.println("\n");
		
		int flag=0;
		
		while(flag==0)
		{
			System.out.println("1. OPERATIONS ON SUPPLIERS\t2. OPERATIONS ON PRODUCTS\t3. OPERATIONS ON ORDERS\n4. OPERATIONS ON ORDER DETAILS\t5. OPERATIONS ON INVENTORY\t6. CUSTOM QUERIES\n0. EXIT");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				supplierOperations();
				break;
			case 2:
				productOperations();
				break;
			case 3:
				orderOperations();
				break;
			case 4:
				orderdetailsOperations();
				break;
			case 5:
				inventoryOperations();
				break;
			case 6:
				customQueries();
				break;
			case 0:
				flag=1;
				break;
			default:
				System.out.println("INVALID INPUT");
				break;
			}
			
		}
	}
	
	private void productOperations() {
		// TODO Auto-generated method stub
		
	}

	private void orderOperations() {
		// TODO Auto-generated method stub
		
	}

	private void orderdetailsOperations() {
		// TODO Auto-generated method stub
		
	}

	private void inventoryOperations() {
		// TODO Auto-generated method stub
		
	}

	private void supplierOperations() {
		// TODO Auto-generated method stub
		
	}

	public void customQueries()
	{
		connection.connectToDb();
		System.out.println("\n");
		int flag=0;
		
		while(flag==0)
		{
			System.out.println("1. List all products along with their supplier names\r\n" + 
					"2. Get all orders with their details (including product names and quantities)\r\n" + 
					"3. Find all suppliers who have supplied a specific product (e.g., ProductID = 1)\r\n" + 
					"4. List all products and their current inventory levels\r\n" + 
					"5. Find all orders placed within the last month\r\n" + 
					"6. Get total quantity ordered for each product\r\n" + 
					"7. Retrieve all orders along with the total amount spent for each order\r\n" + 
					"8. Find products supplied by more than one supplier\r\n" + 
					"9. Get the average inventory level for each product\r\n" + 
					"10. List suppliers who have not supplied any products\r\n" +
					"0. Exit"+
					"");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				connection.List_all_products_along_with_their_supplier_names();
				 break;
			case 2:
				connection.Get_all_orders_with_their_details_including_product_names_and_quantities();
				break;
			case 3:
				connection.Find_all_suppliers_who_have_supplied_a_specific_product();
				break;
			case 4:
				connection.List_all_products_and_their_current_inventory_levels();
				break;
			case 5:
				connection.Find_all_orders_placed_within_the_last_month();
				break;
			case 6:
				connection.Gettotalquantityorderedforeachproduct();
				break;
			case 7:
				connection.Retrieveallordersalongwiththetotalamountspentforeachorder();
				break;
			case 8:
				connection.Findproductssuppliedbymorethanonesupplier();
				break;
			case 9:
				connection.Gettheaverageinventorylevelforeachproduct();
				break;
			case 10:
				connection.Listsupplierswhohavenotsuppliedanyproducts();
				break;
			case 0:
				flag=1;
				break;
			default:
				System.out.println("WRONG INPUT, CHOOSE CORRECT OPTION");
				break;
			}
		}
	}
	
	public void Crud() 
	{
		
	}
}
