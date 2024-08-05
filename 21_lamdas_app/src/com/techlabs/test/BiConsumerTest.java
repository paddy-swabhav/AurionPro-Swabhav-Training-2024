package com.techlabs.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> consumerAdd=(Integer number1,Integer number2) -> System.out.println("ADDITION OF TWO NUMBERS : "+(number1+number2));
	
	consumerAdd.accept(10, 20);
	}

}
