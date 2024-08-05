package com.techlabs.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(20,15,25,45,35);
		
//		Stream<Integer> numberStream =numbers.stream();
//		numberStream.forEach((number)-> System.out.println(number));
		
		System.out.println("PRINT ALL NUMBERS");
		numbers.stream()
				.forEach((number)->System.out.println(number));;
				
				
		System.out.println("\nPRINT ODD NUMBERS");
		numbers.stream()
				.filter((number)->(number%2)!=0)
				.forEach((number)->System.out.println(number));
		
		System.out.println("\nPRINT ODD NUMBERS >25");
		numbers.stream()
				.filter((number)->(number%2)!=0)
				.filter((number)->(number>25))
				.forEach((number)->System.out.println(number));
		
		System.out.println("\n COllecting in list");
		List<Integer> filteredNumbers=numbers.stream()
				.filter((number)->(number%2)!=0)
				.filter((number)->(number>25))
				.collect(Collectors.toList());
		filteredNumbers.stream()
				.forEach((number)->System.out.println(number));
		
		System.out.println("SQUARED NUMBERS: ");
		List<Integer> squaredNumbers=numbers.stream()
				.map((number)-> number*number)
				.collect(Collectors.toList());
		squaredNumbers.stream()
				.forEach((number)->System.out.println(number));
		
	//SUM the elements use REDUCE
		int sum = numbers.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println("SUM : "+sum);
		
	// SORTING STREAM
		List<Integer> sortedList=numbers.stream()
							.sorted()
							.collect(Collectors.toList());
		
		sortedList.stream()
							.forEach((number)->System.out.println(number));
	
	//REVERSE SORTED
		List<Integer> reverseList=numbers.stream()
							.sorted(Comparator.reverseOrder())
							.collect(Collectors.toList());
		reverseList.stream()
		.forEach((number)->System.out.println(number));
		
	//REVERSE SORTED USING COLLECTIONS - reverseSorted() 
		System.out.println("\nREVERSE BY COLLECTIONS");
		List<Integer> reverseList1=numbers.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		reverseList1.stream()
		.forEach((number)->System.out.println(number));
		
	//REVERSE SORTED USING COLLECTIONS - reverseSorted() and LIMIT THE FIRST 3
			System.out.println("\nREVERSE BY COLLECTIONS AND ONLY THE TOP 3");
			List<Integer> reverseList2=numbers.stream()
					.sorted(Collections.reverseOrder())
					.limit(3)
					.collect(Collectors.toList());
			reverseList2.stream()
				.forEach((number)->System.out.println(number));
			
			
	// MAX OF STREAM
			Optional<Integer> max=numbers.stream().max((number1,number2)->number1-number2);
			if(max.isPresent())
				System.out.println("MAX IS: "+max.get());
			
	// MIN OF STREAM
			Optional<Integer> min=numbers.stream().min((number1,number2)->number1-number2);
			if(min.isPresent())
				System.out.println("MIN IS: "+min.get());
			
		
	}
}
