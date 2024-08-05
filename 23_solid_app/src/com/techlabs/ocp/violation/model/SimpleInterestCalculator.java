package com.techlabs.ocp.violation.model;

public class SimpleInterestCalculator {

	FixedDeposit fixedDeposit;
	GetInterestRates interestRates;
	
	public double calculateSimpleInterest()
	{
		return (fixedDeposit.getPrincipal()*fixedDeposit.getDuration()*interestRates.getInterestRates(fixedDeposit));
	}
}
