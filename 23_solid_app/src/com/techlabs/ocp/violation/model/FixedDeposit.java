package com.techlabs.ocp.violation.model;

public class FixedDeposit {

	private int accountNumber;
	private String Name;
	private double principal;
	private int duration;
	private FestivalType festival;
	
	
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public double getPrincipal() {
		return principal;
	}


	public void setPrincipal(double principal) {
		this.principal = principal;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public FestivalType getFestival() {
		return festival;
	}


	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}


	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", Name=" + Name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}
	
	
	private double getInterestRates()
	{
		
		return festival.getInterestRates();
	}
	
	public double calculateSimpleInterest()
	{
		return (principal*duration*getInterestRates());
	}
	
	
	
}
