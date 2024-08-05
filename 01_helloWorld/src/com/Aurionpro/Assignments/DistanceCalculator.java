//Write a program that calculates the distance between
//two points (x1, y1) and (x2, y2) using the distance formula.
//Formula d=sqrt((x2 – x1)² + (y2 – y1)²)

package com.Aurionpro.Assignments;

import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Distance Between Two Points");
		
		System.out.println("Enter the Co-ordinates of FIRST point");
		System.out.println("Enter X1: ");
		float x1=sc.nextFloat();
		System.out.println("Enter Y1: ");
		float y1=sc.nextFloat();

		System.out.println("\nEnter the Co-ordinates of Second point");
		System.out.println("Enter X2: ");
		float x2=sc.nextFloat();
		System.out.println("Enter Y2: ");
		float y2=sc.nextFloat();
		
		float distance=(float) (Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		System.out.println("The Distance Between Two Points is : "+distance+" Units");
	}

}
