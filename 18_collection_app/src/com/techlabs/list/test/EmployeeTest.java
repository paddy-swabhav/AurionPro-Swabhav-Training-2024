package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.list.model.Employee;
import com.techlabs.list.model.EmployeeComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(4,"Paddy",2000));
		employees.add(new Employee(10,"Sova",4000));
		employees.add(new Employee(2,"Raze",20000));
		employees.add(new Employee(15,"Geeko",7000));
		
		System.out.println("THE LIST OF EMPLOYEES IS: ");
		displayEmployee(employees);
		
		System.out.println("\nBY EMPLOYEE ID");
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		displayEmployee(employees);
		
		System.out.println("\nBY EMPLOYEE NAME");
		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		displayEmployee(employees);
		
		System.out.println("\nBY EMPLOYEE SALARY");
		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
		displayEmployee(employees);
	}
	
	public static void displayEmployee(List<Employee> employees)
	{

		for(Employee employee:employees)
			System.out.println(employee);
	}

}
