package com.techlabs.ocp.solution.model;

public class RectangleArea implements AreaOfShapesCalculator{

	private int length;
	private int breadth;
	
	public RectangleArea(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public int area() {
		return length*breadth;
	}

}
