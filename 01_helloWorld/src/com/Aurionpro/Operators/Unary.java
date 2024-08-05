package com.Aurionpro.Operators;

public class Unary {
	public static void main(String[] args)
    {
       System.out.println("UNARY OPERATORS");
           int num = 10;
    
           int result = +num;
           System.out.println(
               "The value of result after unary plus is: "
               + result);
    
           result = -num;
           System.out.println(
               "The value of result after unary minus is: "
               + result);
    
           result = ++num;
           System.out.println(
               "The value of result after pre-increment is: "
               + result);
    
           result = num++;
           System.out.println(
               "The value of result after post-increment is: "
               + result);
    
           result = --num;
           System.out.println(
               "The value of result after pre-decrement is: "
               + result);
    
           result = num--;
           System.out.println(
               "The value of result after post-decrement is: "
               + result);
       }
}
