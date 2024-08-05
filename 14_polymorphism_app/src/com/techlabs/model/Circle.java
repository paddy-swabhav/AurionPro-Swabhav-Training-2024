package com.techlabs.model;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("AREA OF CIRCLE IS : "+(3.14*radius*radius));
	}

}
