package com.techlabs.list.model;

public class Student {
	private String name;
	private int roll_no;
	private double percentage;
	public Student(String name, int roll_no, double percentage) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", percentage=" + percentage + "]";
	}
	
	
}
