package com.techlabs.ocp.violation.model;

public enum FestivalType {

	NEWYEAR(8),HOLI(8.5),DIWALI(7.5),OTHERS(6.5);
	
	private double interestRates;

	private FestivalType(double interestRates) {
		this.interestRates = interestRates;
	}


	public void setInterestRates(double interestRates) {
		this.interestRates = interestRates;
	}

	public double getInterestRates() {
		// TODO Auto-generated method stub
		return interestRates;
	}
	
	
}
