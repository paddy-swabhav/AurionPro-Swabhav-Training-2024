package com.techlabs.interative.tese;

public class OddNumberPrinter {

	public static void main(String[] args) {
		int number=1;
		System.out.println("ODD NUMBERS FROM 1 to 100: ");
		while(number<=100)
		{
			
			if(number%2!=0)
				System.out.println(number);
			number++;
		}
	}

}
