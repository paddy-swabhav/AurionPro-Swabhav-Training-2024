package com.Aurionpro.Assignments;

public class DistanceCalculatorCmdArgs {

	public static void main(String[] args) {
		System.out.println("Distance Between Two Points");
		
		System.out.println("The Co-ordinates of FIRST point");
		System.out.println("X1: "+Float.parseFloat(args[0]));
		float x1=Float.parseFloat(args[0]);
		System.out.println("Y1: "+Float.parseFloat(args[1]));
		float y1=Float.parseFloat(args[1]);
		
		System.out.println("\nThe Co-ordinates of Second point");
		System.out.println("X2: "+Float.parseFloat(args[2]));
		float x2=Float.parseFloat(args[2]); 
		System.out.println("Y2: "+Float.parseFloat(args[3]));
		float y2=Float.parseFloat(args[3]);
		
		float distance=(float) (Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		System.out.println("\n\nThe Distance Between Two Points is : "+distance+" Units");

	}

}
