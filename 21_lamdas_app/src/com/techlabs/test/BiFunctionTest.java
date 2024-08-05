// BiFUNCTION ACCEPTS Two ARG OF ANY TYPE AND RETURN DATA OF ANY TYPE
// BiFunction<Argument data type,Argument data type, Method Return type >

package com.techlabs.test;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> additionFunction = (Integer number1,Integer number2) -> number1+number2; 
	
		System.out.println(additionFunction.apply(10,20));
	}

}
