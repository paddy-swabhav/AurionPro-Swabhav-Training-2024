package com.techlabs.iterator.model;

import java.util.List;

public class Company implements IAggregate<Employee> {

	private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public IIterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
