/*Write a program that converts minutes into hours and minutes 
(e.g., 130 minutes is 2 hours and 10 minutes).
 */

package com.Aurionpro.Assignments;

import java.util.Scanner;

public class MinutesConverter {

	public static void main(String[] args) {
		System.out.println("Minutes Converter Into Hours And Minutes");
		Scanner sc= new Scanner(System.in);
		System.out.println("\nENTER MINUTES: ");
		long  minutes=sc.nextLong();
	
		System.out.println("The time is:  "+minutes/60+" Hours And "+minutes%60+" Minutes");
		
	}

}
