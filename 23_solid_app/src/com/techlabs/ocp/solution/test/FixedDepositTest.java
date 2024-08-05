package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.model.DiwaliInterestRates;
import com.techlabs.ocp.solution.model.HoliInterestRates;
import com.techlabs.ocp.solution.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit= new FixedDeposit(100,"Paddy",10000.00,2,new DiwaliInterestRates());
		FixedDeposit fixedDeposit1= new FixedDeposit(100,"Paddy",10000.00,2,new HoliInterestRates());
		
		display(fixedDeposit);
		display(fixedDeposit1);
		
		

	}
	public static void display(FixedDeposit fixedDeposit)
	{
		System.out.println("\n\nACCOUNT NUMBER: "+fixedDeposit.getAccountNumber());
		System.out.println("NAME: "+fixedDeposit.getName());
		System.out.println("PRINCIPAL: "+fixedDeposit.getPrincipal());
//		System.out.println("FESTIVAL: "+fixedDeposit.getFestival());
		System.out.println("SIMPLE INTEREST: "+fixedDeposit.calculateSimpleInterest());
	}
}
