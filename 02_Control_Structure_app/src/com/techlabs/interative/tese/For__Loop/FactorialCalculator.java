package com.techlabs.interative.tese.For__Loop;
import java.util.*;

public class FactorialCalculator {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER: ");
	 int number=sc.nextInt();
	 int fact=1;
	 for(int i=1;i<=number;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println("FACTORIAL OF "+number+" IS : "+fact);
	}

}
