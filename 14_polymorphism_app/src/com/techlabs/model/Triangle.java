package com.techlabs.model;

public class Triangle extends Shape{
	private int base,height;
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("AREA OF TRIANGLE: "+(0.5*base*height));
		
	}
	

}
