package com.techlabs.model;

public class Rectangle {
	private int length;
	private int breadth,area;
	
	public Rectangle()
	{
		length=10;
		breadth=10;
	}
	
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	
	public void setBreadth(int breadth)
	{
		this.breadth=breadth;
	}
	public int getBreadth()
	{
		return breadth;
	}
	
	
	public int area()
	{
		area=length*breadth;
		return area;
	}
	
	public void display() 
	{
		System.out.println("THE BREADTH IS: "+breadth);
		System.out.println("THE LENGTH IS: "+length);
		
		System.out.println("\nTHE AREA OG THE REACTANGLE IS: "+area);
	}
	
}
