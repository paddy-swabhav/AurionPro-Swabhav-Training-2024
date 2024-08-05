package com.techlabs.list.model;

public class Employee {
	
	private int employeeid;
	private String name;
	private int salary;
	
	
	public Employee() //DEFAULT CONSTRUCTOR
	{
		employeeid=1;
		name="DEFAULT";
		salary=1000;
	}
	
	public Employee(int i,String n,int s) //PARAMETERIZED CONSTRUCTOR
	{
		employeeid=i;
		name=n;
		salary=s;
	}
	
	public void setEmployeeid(int id)
	{
		employeeid=id;
	}
	public int getEmployeeid()
	{
		return employeeid;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int s)
	{
		salary=s;
	}
	public int getSalary()
	{
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
