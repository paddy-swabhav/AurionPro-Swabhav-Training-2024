package com.techlabs.test;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier=()-> {return 10+10;};
		
		System.out.println(supplier.get());
		
		Supplier<Integer> randomNoSupplier=() ->(int)(Math.random()*1000)	;
		
		System.out.println("RANDOM NUMBER: "+randomNoSupplier.get());
	}

}
