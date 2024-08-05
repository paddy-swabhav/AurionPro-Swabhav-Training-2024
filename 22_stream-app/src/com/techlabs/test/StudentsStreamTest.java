package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsStreamTest {

	public static void main(String[] args) {
		List<String> students= new ArrayList<String>();
		students.add("Jayesh");
		students.add("Nimesh");
		students.add("Mark");
		students.add("Mahesh");
		students.add("Ramesh");
		
		//PRINT
		
		students.stream()
				.forEach((student)->System.out.println(student));
		
		
		//FIRST 3 STUDENTS IN SORTED 
		System.out.println("\nFIRST THREE IN SORTED: ");
		students.stream()
				.sorted()
				.limit(3)
				.forEach((student)->System.out.println(student));
	
		//FIRST 3 STUDENTS IN ASCENDING IF CONTAINS 'a'
		System.out.println("\nFIRST 3 IF contains a");
		students.stream()
				.filter((student)-> student.contains("a"))
				.limit(3)
				.forEach((student)->System.out.println(student));
		
		//IN DESCENDING ORDER
		System.out.println("IN DESCENDING ORDER");
		students.stream()
				.sorted(Collections.reverseOrder())
				.forEach((student)->System.out.println(student));
		
		//FIRST 3 CHAR OF NAMES
		System.out.println("\nFIRST THREE CHAR OF NAMES: ");
		Stream<String> subStudent=students.stream()
				.map((student)->student.substring(0, 3));
		
		subStudent.forEach((student)->System.out.println(student));
		
		//STUDENTS QITH LESS THAN OR EQUAL TO 4 CHAR
		System.out.println("\n`STUDENTS WITH <= 4 chars");
		List<String> filteredList=students.stream()
				.filter((student)->student.length()<=4)
				.collect(Collectors.toList());
		filteredList.stream()
					.forEach((student)->System.out.println(student));
		
		
		
		

	}

}
