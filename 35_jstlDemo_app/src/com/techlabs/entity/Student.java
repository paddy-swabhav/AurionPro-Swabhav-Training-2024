package com.techlabs.entity;

public class Student {

	private int rollnumber;
	private String name;
	private Double percentage;
	
	public Student(int rollnumber, String name, Double percentage) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.percentage = percentage;
	}

	public int getRollNumber() {
		return rollnumber;
	}

	public String getName() {
		return name;
	}

	public Double getPercentage() {
		return percentage;
	}
	
	
	

}
