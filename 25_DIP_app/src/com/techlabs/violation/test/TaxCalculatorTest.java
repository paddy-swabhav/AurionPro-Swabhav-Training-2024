package com.techlabs.violation.test;

import com.techlabs.violation.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		
		TaxCalculator t1= new TaxCalculator();
		System.out.println(t1.calculateTax(10000, 5));
		
		TaxCalculator t2= new TaxCalculator();
		System.out.println(t2.calculateTax(25000, 5));

	}

}
