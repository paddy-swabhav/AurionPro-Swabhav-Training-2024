package com.Aurionpro.model;


public class CmdArgsSwapper {
	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		int temp;
		
		System.out.println("Numbers before Swapping");
		System.out.println("Number 1 : "+number1+"\t Number 2: "+number2);
		
		temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("\n Numbers After Swapping");
		System.out.println("Number 1 : "+number1+"\t Number 2: "+number2);	
	}
	
}
