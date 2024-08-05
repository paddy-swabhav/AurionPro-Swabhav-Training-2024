package com.techlabs.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<Integer> squareConsumer=(Integer number) -> System.out.println("SQUARE OF "+number+": "+number*number);
		squareConsumer.accept(5);
		
		
		Consumer<Integer> factorialConsumer=(Integer number) -> {
			
			int fact=1;
			for(int i=1;i<=number;i++)
				fact=fact*i;
			System.out.println("FACTORIAL OF "+number+": "+fact);
		};
		
		factorialConsumer.accept(5);
		
	}
	
}
