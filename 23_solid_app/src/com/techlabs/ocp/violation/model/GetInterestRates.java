package com.techlabs.ocp.violation.model;

public class GetInterestRates {
	
	FixedDeposit fixedDeposit;
	
	
	public double getInterestRates(FixedDeposit fixedDeposit)
	{
		return fixedDeposit.getFestival().getInterestRates();
	}
}
