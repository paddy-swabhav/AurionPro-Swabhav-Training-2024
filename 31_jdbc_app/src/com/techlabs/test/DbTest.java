package com.techlabs.test;

import com.techlabs.model.DbConnection;

public class DbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbConnection connection = new DbConnection();	
		connection.connectToDb();
		connection.getStudentDetails();
//		
//		connection.setStudentDetails();
//		System.out.println("\n\n");
//		connection.getStudentDetails();
		
//		connection.updateStudentPercentage();
//		System.out.println("\n\n");
//		connection.getStudentDetails();
		
//		connection.deleteStudent();
//		System.out.println("\n\n");
//		connection.getStudentDetails();
		connection.metaData();
		
		
	}

}
