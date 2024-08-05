// FUNCTION ACCEPTS ONE ARG OF ANY TYPE AND RETURN DATA OF ANY TYPE
// Function<Argument data type, Return type >

package com.techlabs.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Integer,Integer> squareFunction=(Integer number)-> number*number;
		
		System.out.println("SQUARE OF THE NUMBER IS: "+squareFunction.apply(6));

	}

}
