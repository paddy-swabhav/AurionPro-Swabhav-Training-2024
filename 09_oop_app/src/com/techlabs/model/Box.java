package com.techlabs.model;

import java.util.Scanner;

public class Box {
	
	private int width;
	private int height;
	private int depth;
	Scanner sc= new Scanner(System.in);
	
	public Box(int width,int height,int depth) 
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public Box() 
	{
		width=10;
		height=10;
		depth=10;
	}
//	public void readData()
//	{
//		System.out.println("ENTER VALUES");
//		depth=sc.nextInt();
//		height=sc.nextInt();
//		width=sc.nextInt();
//	}
	
	public void setWidth(int width)
	{
		width=width;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setHeight(int height)
	{
		height=height;
	}
	public int getHeight()
	{
		return height;
	}
	
	public void setDepth(int depth)
	{
		depth=depth;
	}
	public int getDepth()
	{
		return depth;
	}
	
//	public void display()
//	{
//		System.out.println("\n "+height);
//		System.out.println("\n "+width);
//		System.out.println("\n "+depth);
//	}
	
	public int area(int height, int width, int depth)
	{
		int area= height*width*depth;
		return area;
		
	}
	
	
	public void area()
	{
		int area= height*width*depth;
		System.out.println("THE AREA IS: "+area);
		
	}
	
}
