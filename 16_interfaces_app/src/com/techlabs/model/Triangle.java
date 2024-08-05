package com.techlabs.model;

public class Triangle implements Shape{
	private int base,height;
	
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}


	@Override
	public void area() {
		System.out.println("AREA OF triangle: "+(0.5*base*height));
		
	}
}
