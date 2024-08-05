package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;
import com.techlabs.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape shape;
		
		shape= new Circle(25);
		shape.area();
		
		shape=new Rectangle(10,20);
		shape.area();
		
		shape=new Triangle(10,20);
		shape.area();
	}
}
