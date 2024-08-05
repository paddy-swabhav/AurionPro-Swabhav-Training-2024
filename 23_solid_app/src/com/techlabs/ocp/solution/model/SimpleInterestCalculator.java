package com.techlabs.ocp.solution.model;

public class SimpleInterestCalculator {

	FixedDeposit fixedDeposit;
	GetInterest interestRates;
	
	public double calculateSimpleInterest()
	{
		return (fixedDeposit.getPrincipal()*fixedDeposit.getDuration()*interestRates.getInterestRates(fixedDeposit));
	}
}
