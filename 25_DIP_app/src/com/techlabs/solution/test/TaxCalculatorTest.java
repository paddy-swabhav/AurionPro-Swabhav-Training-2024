package com.techlabs.solution.test;

import com.techlabs.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		
		TaxCalculator t1= new TaxCalculator();
//		System.out.println(t1.calculateTax(10000, 0));
		t1.calculateTax(10000, 0);
		
		System.out.println("\n");
		
		TaxCalculator t2= new TaxCalculator();
//		System.out.println(t2.calculateTax(25000, 5));
		t2.calculateTax(25000, 5);

	}

}
