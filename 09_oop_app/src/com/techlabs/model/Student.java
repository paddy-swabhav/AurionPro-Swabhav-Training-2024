package com.techlabs.model;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private float percentage;
	
	
	public void setRollno(int r)
	{
		rollno=r;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setPercentage(float p)
	{
		percentage=p;
	}
	public float getPercentage()
	{
		return percentage;
	}
}
