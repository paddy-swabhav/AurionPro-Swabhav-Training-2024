package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionManagementTest {

	public static void main(String[] args) {
		
		getStudentDetails();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb",username,password);
	
			connection.setAutoCommit(false);
			Scanner scanner= new Scanner(System.in);
			System.out.println("ENTER ROLL NUMBER: ");
			int rollnumber= scanner.nextInt();
			System.out.println("ENTER NAME: ");
			String name= scanner.next();
			System.out.println("ENTER PERCENTAGE: ");
			double percentage= scanner.nextDouble();
			
			
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?)");
			preparedStatement.setInt(1, rollnumber);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, percentage);
			
			preparedStatement.execute();

			getStudentDetails();
			
			connection.rollback();
			
			connection.commit();
			
			getStudentDetails();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // 1. REGISTER DRIVER
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	public static void getStudentDetails()
	{
		//create statement
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			
			Statement statement = connection.createStatement();
			ResultSet dbStudentData = statement.executeQuery("SELECT * FROM students");
			
			while(dbStudentData.next())
			{
				System.out.println(dbStudentData.getInt("rollnumber")+"\t"+dbStudentData.getString("name")+"\t"+dbStudentData.getDouble("percentage"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
