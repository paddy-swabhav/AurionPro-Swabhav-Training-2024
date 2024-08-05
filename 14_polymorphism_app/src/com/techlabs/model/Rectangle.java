package com.techlabs.model;

public class Rectangle extends Shape{
	private int length,breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("AREA OF RECTANGLE: "+(length*breadth));
	}

}
