package com.Aurionpro.model;



public class CmdArgsCalci {
	public int Add(int a,int b)
	{
		return a+b;
	}
	
	public int Sub(int a,int b)
	{
		return b-a;
	}
	
	public int Mul(int a,int b)
	{
		return a*b;
	}
	
	public int Div(int a,int b)
	{
		return b/a;
	}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
		
		int a=Integer.parseInt(args[0]);
	
		int b=Integer.parseInt(args[1]);
		System.out.println("The Addition of two numbers: "+c.Add(a,b));
		System.out.println("The Subtraction of two numbers: "+c.Sub(a,b));
		System.out.println("The Multiplication of two numbers: "+c.Mul(a,b));
		System.out.println("The Division of two numbers: "+c.Div(a,b));
	}
}
