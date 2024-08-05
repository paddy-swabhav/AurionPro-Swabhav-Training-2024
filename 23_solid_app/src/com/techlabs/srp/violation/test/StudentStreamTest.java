package com.techlabs.srp.violation.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		
		String file="D://AurionPro_Training//23_solid_app//src//com//techlabs//srp//violation//test//students.txt";
		
		try (Stream<String> stream = Files.lines(Paths.get(file))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
