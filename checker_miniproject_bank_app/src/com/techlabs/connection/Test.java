package com.techlabs.connection;

public class Test {

	public static void main(String[] args) {
		
//		DatabaseConnection databaseConnection = new DatabaseConnection();
//		databaseConnection.connectToDb();
		CustomerConnection customerConnection = new CustomerConnection();
		
		customerConnection.getCustomerDetails();
		

	}

}
