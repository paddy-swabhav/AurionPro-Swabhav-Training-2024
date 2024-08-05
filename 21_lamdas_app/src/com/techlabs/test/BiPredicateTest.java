package com.techlabs.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> greaterNoPredicate= (Integer number1, Integer number2) -> (number1>number2);
		
		System.out.println(greaterNoPredicate.test(30, 40));
	}

}
