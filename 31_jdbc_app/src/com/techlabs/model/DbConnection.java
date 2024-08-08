package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	private Connection connection=null;
	private Statement statement=null;	
	private PreparedStatement preparedStatement= null;
	
	public void connectToDb()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   // 1. REGISTER DRIVER
			
			//CREATE CONNECTION
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb",username,password);
			
			statement = connection.createStatement();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("CONNECTION SUCCESSFUL");
		
	}
	
	public void getStudentDetails()
	{
		//create statement
		try {
			
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
	
	
	public void setStudentDetails()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER ROLL NUMBER: ");
		int rollnumber= scanner.nextInt();
		System.out.println("ENTER NAME: ");
		String name= scanner.next();
		System.out.println("ENTER PERCENTAGE: ");
		double percentage= scanner.nextDouble();
		
		
		
		try {
//			statement.executeUpdate("INSERT INTO students values("+rollnumber+",'"+name+"',"+percentage+")");
			
			preparedStatement = connection.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?)");
			preparedStatement.setInt(1, rollnumber);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, percentage);
			
			preparedStatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateStudentPercentage()
	{
		System.out.println("\n UPDATE PERCENTAGE");
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER ROLL NUMBER: ");
		int rollnumber= scanner.nextInt();
		
		System.out.println("ENTER NEW PERCENTAGE: ");
		double percentage= scanner.nextDouble();
		
		
		try {
//			statement.executeUpdate("UPDATE students  SET percentage ="+percentage+" WHERE rollnumber="+rollnumber+"");
			
			preparedStatement = connection.prepareStatement("UPDATE STUDENTS SET percentage=(?) WHERE rollnumber=(?)");
			preparedStatement.setDouble(1, percentage);

			preparedStatement.setInt(2, rollnumber);
			
			preparedStatement.execute();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void deleteStudent()
	{
		System.out.println("\n DELETE STUDENT \n");
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER ROLL NUMBER NEEDED TO DELETE: ");
		int rollnumber= scanner.nextInt();
		
		
		
		try {
//			statement.executeUpdate("UPDATE students  SET percentage ="+percentage+" WHERE rollnumber="+rollnumber+"");
			
			preparedStatement = connection.prepareStatement("DELETE FROM STUDENTS WHERE rollnumber=(?)");

			preparedStatement.setInt(1, rollnumber);
			
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
