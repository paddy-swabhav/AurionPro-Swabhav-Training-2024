package com.techlabs.test;

public class Test {
	public static void main(String[] args) {
		
		
		try 
		{
			int number2=Integer.parseInt(args[1]);
			int number1=Integer.parseInt(args[0]);
			
			double result= number1/number2;
			System.out.println("DIVISION IS"+result);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("INVALID INPUT FOR NUMBER2, CANNOT DIVIDE BY ZERO");
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("DIVISION REQUIRES 2 NUMBERS, GIVE two values");
		}
		catch(NumberFormatException exception)
		{
			System.out.println("ENTER A VALID NUMBER, DIVISION IS PERFORMED ON NUMBERS ONLY");
		}
		catch(Exception e)
		{
			System.out.println("EXCEPTION OCCURED");
		}
		finally
		{
			System.out.println("INSIDE FINALLY");
		}
		System.out.println("EXITING");
	}
}
