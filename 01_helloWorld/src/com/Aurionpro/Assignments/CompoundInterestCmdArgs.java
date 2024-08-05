package com.Aurionpro.Assignments;


public class CompoundInterestCmdArgs {

	public static void main(String[] args) {
		System.out.println("Compund Interest Calculator");
		
		System.out.println("The Principal Amount: "+Float.parseFloat(args[0]));
		float principal=Float.parseFloat(args[0]);
		
		System.out.println("The Rate Of Interest: "+Float.parseFloat(args[1]));
		float roi=Float.parseFloat(args[1]);
		
		System.out.println("The Time: "+Float.parseFloat(args[2]));
		float time=Float.parseFloat(args[2]);
		
		float compound_Interest=(float) (principal*Math.pow((1+(roi/100)), time));
		
		System.out.println("The Compound Interest is: "+compound_Interest);

	}

}
