package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		Box box= new Box();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("FOR FIRST OBJECT: \n\n");
		System.out.println("ENTER HEIGHT");
		int height=sc.nextInt();
		System.out.println("ENTER WIDTH");
		int width=sc.nextInt();
		System.out.println("ENTER DEPTH");
		int depth= sc.nextInt();
		
//		box.setDepth(depth);
//		box.setHeight(height);
//		box.setWidth(width);
		
		
		System.out.println("HEIGHT: "+box.getHeight() );
		System.out.println("WIDTH: "+box.getWidth());
		System.out.println("DEPTH: "+box.getDepth());
		
		
		// 2ND OBJECT
		
		Box box2= new Box(width,height,depth);
//		System.out.println("FOR SECOND OBJECT: \n\n");
//		System.out.println("ENTER HEIGHT");
//		height=sc.nextInt();
//		System.out.println("ENTER WIDTH");
//		width=sc.nextInt();
//		System.out.println("ENTER DEPTH");
//		depth= sc.nextInt();
//		
//		box2.setDepth(depth);
//		box2.setHeight(height);
//		box2.setWidth(width);
		
		
		System.out.println("\n\nHEIGHT: "+box2.getHeight() );
		System.out.println("WIDTH: "+box2.getWidth());
		System.out.println("DEPTH: "+box2.getDepth());

		
		
		
//		System.out.println(box.area(30, 20, 10));
//		
//		System.out.println("VOID");
//		box.area();
	
	
		sc.close();
	}

}
