package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.FestivalType;
import com.techlabs.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit= new FixedDeposit(100,"Paddy",10000.00,2,FestivalType.HOLI);
		FixedDeposit fixedDeposit1= new FixedDeposit(100,"Paddy",10000.00,2,FestivalType.DIWALI);
		
		display(fixedDeposit);
		display(fixedDeposit1);
		
		

	}
	public static void display(FixedDeposit fixedDeposit)
	{
		System.out.println("\n\nACCOUNT NUMBER: "+fixedDeposit.getAccountNumber());
		System.out.println("NAME: "+fixedDeposit.getName());
		System.out.println("PRINCIPAL: "+fixedDeposit.getPrincipal());
		System.out.println("FESTIVAL: "+fixedDeposit.getFestival());
		System.out.println("SIMPLE INTEREST: "+fixedDeposit.calculateSimpleInterest());
	}
}
