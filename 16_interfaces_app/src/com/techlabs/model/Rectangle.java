package com.techlabs.model;

public class Rectangle implements Shape{
	private int length,breadth;
	
	@Override
	public void area() {
		System.out.println("AREA OF RECTANGLE: "+(length*breadth));
		
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
