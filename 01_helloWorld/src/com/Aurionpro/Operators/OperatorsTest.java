package com.Aurionpro.Operators;

public class OperatorsTest {

	public static void main(String[] args) {
		int a=5, b=7, c=8;
		
		if((a>b)&&(b>c))
			System.out.println("A="+a+" is greater");
		else
			System.out.println("a is not greater");
		
		if((a>b)||(b<c))
			System.out.println("Statement Statisfied");
		
		
	}

}
