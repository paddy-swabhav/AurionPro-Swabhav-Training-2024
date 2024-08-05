package com.techlabs.solution.model;

public class TaxCalculator {
	
	ILogger logger;
	
	public void calculateTax(int amount,int rate)
	{
		int tax=0;
		try {
			tax=amount/rate;
			System.out.println(tax);
//			return tax;
		}
		catch(Exception e){
			new DBLogger().log("DIVIDING BY ZERO");
			new NetworkLogger().log("DIVIDING BY ZERO");
		}
	}
	
}
