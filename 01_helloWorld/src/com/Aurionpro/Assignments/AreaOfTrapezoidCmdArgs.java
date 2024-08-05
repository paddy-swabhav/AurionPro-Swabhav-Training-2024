package com.Aurionpro.Assignments;

public class AreaOfTrapezoidCmdArgs {

	public static void main(String[] args) {

		System.out.println("Enter the Base 1: "+Float.parseFloat(args[0]));
		float base1=Float.parseFloat(args[0]);

		System.out.println("Enter the Base 2: "+Float.parseFloat(args[1]));
		float base2=Float.parseFloat(args[1]);
		
		System.out.println("Enter the Height: "+Float.parseFloat(args[2]));
		float height=Float.parseFloat(args[2]);
		
		float area= ((base1+base2)/2)*height;
		System.out.println("The Area of Trapezoid is : "+ area+ " unit sqaure");
	}

}

