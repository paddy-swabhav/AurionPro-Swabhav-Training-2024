package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle();// DEFAULT
		
		Scanner sc= new Scanner(System.in);
		
		
//		System.out.println("FOR THE FIRST OBJECT: ");
//		System.out.println("ENTER LENGTH");
//		int length=sc.nextInt();
//		rectangle1.setLength(length);
//		System.out.println("ENTER BREADTH");
//		int breadth=sc.nextInt();
//		rectangle1.setBreadth(breadth);
		
		System.out.println("LENGTH: "+rectangle1.getLength());
		System.out.println("BREADTH: "+rectangle1.getBreadth());
		System.out.println("AREA: "+rectangle1.area());
//		rectangle1.readData();
//		rectangle1.area();
//		rectangle1.display();
		
		System.out.println("\n\n\nFOR THE SECOND OBJECT");
		System.out.println("ENTER LENGTH");
		int length=sc.nextInt();
		System.out.println("ENTER BREADTH");
		int breadth=sc.nextInt();
		
		Rectangle rectangle2=new Rectangle(length,breadth);// PARAMETERIZED`
		
		System.out.println("LENGTH: "+rectangle2.getLength());
		System.out.println("BREADTH: "+rectangle2.getBreadth());
		System.out.println("AREA: "+rectangle2.area());
//		rectangle2.readData();
//		rectangle2.area();
//		rectangle2.display();
	}

}
