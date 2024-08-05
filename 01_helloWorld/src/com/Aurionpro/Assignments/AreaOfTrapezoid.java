//Write a program that calculates the area of a trapezoid, given the lengths of its bases and height.
//A=((a+b)/2)*h

package com.Aurionpro.Assignments;

import java.util.Scanner;

public class AreaOfTrapezoid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base 1: ");
		float base1=sc.nextFloat();

		System.out.println("Enter the Base 2: ");
		float base2=sc.nextFloat();
		
		System.out.println("Enter the Height: ");
		float height=sc.nextFloat();
		
		float area= ((base1+base2)/2)*height;
		System.out.println("The Area of Trapezoid is : "+ area+ " unit sqaure");
	}

}
