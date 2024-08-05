package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF EMPLOYEES YOU WANT TO CREATE");
		int no_of_employees=scanner.nextInt();
		Employee employees[]= new Employee[no_of_employees];
		
		
//		System.out.println("ENTER THE DETAILS OF FIRST EMPLOYEE: \n");
//		System.out.println("ENTER EMPLOYEE ID.: ");
//		employee.setEmployeeid(scanner.nextInt());
//		System.out.println("ENTER NAME: ");
//		employee.setName(scanner.next());
//		System.out.println("ENTER SALARY: ");
//		employee.setSalary(scanner.nextInt());
		
		for(int i=0;i<employees.length;i++)
		{
		System.out.println("ENTER THE DETAILS OF "+(i+1)+" EMPLOYEE: \n");
		System.out.println("ENTER EMPLOYEE ID.: ");
		int employee_id=(scanner.nextInt());
		System.out.println("ENTER NAME: ");
		String name=(scanner.next());
		System.out.println("ENTER SALARY: ");
		int salary=(scanner.nextInt());
		
		employees[i] = new Employee(employee_id,name,salary);
		}
		
		for(int i=0;i<employees.length;i++)
		{
		System.out.println("\n\nDETAILS OF THE EMPLOYEE "+(i+1)+" ARE:\n");
		System.out.println("EMPLOYEE ID.: "+employees[i].getEmployeeid());
		System.out.println("NAME: "+employees[i].getName());
		System.out.println("SALARY: "+employees[i].getSalary());
		}
		
//		System.out.println("\n\nDETAILS OF THE SECOND EMPLOYEE ARE:\n");
//		System.out.println("EMPLOYEE ID.: "+employee1.getEmployeeid());
//		System.out.println("NAME: "+employee1.getName());
//		System.out.println("SALARY: "+employee1.getSalary());
	}

}
