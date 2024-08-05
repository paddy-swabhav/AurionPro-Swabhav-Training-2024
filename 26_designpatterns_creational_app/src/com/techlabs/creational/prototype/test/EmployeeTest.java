package com.techlabs.creational.prototype.test;

import com.techlabs.creational.prototype.model.EmployeeRecord;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		 EmployeeRecord e1=new EmployeeRecord(101,"Paddy","Trainee",35000,"Mumbai");  
         
	        e1.showRecord();  
	        System.out.println("\n");  
	        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
	        e2.showRecord();  
	}
}
