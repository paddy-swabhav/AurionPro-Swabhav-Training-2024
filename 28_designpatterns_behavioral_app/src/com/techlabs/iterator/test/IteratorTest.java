package com.techlabs.iterator.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.iterator.model.Company;
import com.techlabs.iterator.model.Employee;
import com.techlabs.iterator.model.IIterator;

public class IteratorTest {

	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 70000));

        Company company = new Company(employees);
        IIterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.next().getSalary();
        }

        System.out.println("Total salary: " + totalSalary);
    }
}
