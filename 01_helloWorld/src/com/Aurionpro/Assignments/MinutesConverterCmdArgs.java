package com.Aurionpro.Assignments;


public class MinutesConverterCmdArgs {

	public static void main(String[] args) {
		System.out.println("Minutes Converter Into Hours And Minutes");
		long  minutes=Long.parseLong(args[0]);
	
		System.out.println("The time is:  "+minutes/60+" Hours And "+minutes%60+" Minutes");
	}

}
