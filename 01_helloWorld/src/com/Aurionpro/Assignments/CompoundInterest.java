//Write a program to calculate the compound interest given principal, rate of interest, and time.
//Compound Interest = P(1 + R/100)t

package com.Aurionpro.Assignments;
import java.util.*;

public class CompoundInterest {

	public static void main(String[] args) {
		System.out.println("Compund Interest Calculator");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount: ");
		float principal=sc.nextFloat();
		
		System.out.println("Enter the Rate Of Interest: ");
		float roi=sc.nextFloat();
		
		System.out.println("Enter the Time: ");
		float time=sc.nextFloat();
		
		float compound_Interest=(float) (principal*Math.pow((1+(roi/100)), time));
		
		System.out.println("The Compound Interest is: "+compound_Interest);
	}

}
