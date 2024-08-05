// PREDICATE (ACCEPTS ONE ARG) (RETURNS BOLLEAN)

package com.techlabs.test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> evenPredicate=(Integer number) -> (number%2==0);
		
		System.out.println(evenPredicate.test(5));
	}

}
