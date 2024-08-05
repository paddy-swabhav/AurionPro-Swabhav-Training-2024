package com.techlabs.model;

public class AccountObjectCounter {
	static int count=0;
	
	public AccountObjectCounter()
	{
		count++;
	}
	
	public static void counter()
	{
		System.out.println(count);
	}
}
