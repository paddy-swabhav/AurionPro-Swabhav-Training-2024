package com.techlabs.test;

import com.techlabs.model.ITest;
import com.techlabs.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		
		//constructor
		ITest test= Reference::new;
		method(test);
		
		//static method
		ITest test1= Reference :: staticPrint;
		method(test1);
		
		//non-static method
		Reference reference= new Reference();
		ITest test2= reference :: print;
		method(test2);
	}
	
	private static void method(ITest test)
	{
		test.display();
	}

}
