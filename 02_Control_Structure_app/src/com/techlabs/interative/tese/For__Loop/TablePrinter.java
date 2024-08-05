package com.techlabs.interative.tese.For__Loop;

import java.util.Scanner;

public class TablePrinter {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ENTER THE NUMBER: ");
		 int number=sc.nextInt();
		 System.out.println("THE TABLE OF "+number+" IS: ");
		 for(int i=1;i<11;i++)
		 {
			 System.out.println(number+" * "+i+" = "+number*i);
		 }

	}

}
