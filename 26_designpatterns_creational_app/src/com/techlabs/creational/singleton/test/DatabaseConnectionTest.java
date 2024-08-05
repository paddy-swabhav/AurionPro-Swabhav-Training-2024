package com.techlabs.creational.singleton.test;

import com.techlabs.creational.singleton.model.DatabaseConnection;

public class DatabaseConnectionTest {

	public static void main(String[] args) {
		
		DatabaseConnection connection = DatabaseConnection.getConnection();
		
		connection.status();

	}

}
