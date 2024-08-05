package com.Aurionpro.model;
import java.util.*;

public class Calculator {
	public double Add(double a,double b)
	{
		return a+b;
	}
	
	public double Sub(double a,double b)
	{
		return b-a;
	}
	
	public double Mul(double a,double b)
	{
		return a*b;
	}
	
	public double Div(double a,double b)
	{
		return b/a;
	}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		double a=sc.nextDouble();
		System.out.println("Enter the Second Number: ");
		double b=sc.nextDouble();
//		double sum=a+b, sub=b-a, div=b/a, mul=a*b;
//		System.out.println("Addition of two numbers :"+sum);
//		System.out.println("Substraction of two numbers:"+sub);
//		System.out.println("Multiplication of two numbers:"+mul);
//		System.out.println("Divison of two numbers:"+div);
		System.out.println("The Addition of two numbers: "+c.Add(a,b));
		System.out.println("The Subtraction of two numbers: "+c.Sub(a,b));
		System.out.println("The Multiplication of two numbers: "+c.Mul(a,b));
		System.out.println("The Division of two numbers: "+c.Div(a,b));
	}
}

