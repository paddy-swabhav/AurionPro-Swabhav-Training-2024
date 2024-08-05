package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operations;
	
	@BeforeEach
	void init()
	{
	operations = new Operations();
	}
	
	@AfterEach
	void status()
	{
		System.out.println("TEST EXECUTED");
	}
	
	@Test
	void testAddition() {

//		fail("Not yet implemented");
		
//		int actual = operations.addition(5, 5);
//		int expected=10;
	
		assertEquals(10,operations.addition(5, 5),"THIS FUNCTION DOES ADD");
	}
	
	@Test
	void testSubtraction() {


	
		assertEquals(10,operations.subtraction(15, 5),"THIS FUNCTION DOES SUBSTRACT");
	}
	
	@Test
	void testMultiply() {


		assertEquals(10,operations.multiply(5, 2),"THIS FUNCTION DOES MULTIPLY");
	}
	
	@Test
	void testDivision() {

		assertEquals(5,operations.division(10, 2),"THIS FUNCTION DOES division");
		assertThrows(ArithmeticException.class, ()-> operations.division(6,0));
	}

}
