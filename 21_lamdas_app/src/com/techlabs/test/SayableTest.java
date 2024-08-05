package com.techlabs.test;

import com.techlabs.model.ISayable;

public class SayableTest {

	public static void main(String[] args) {
		
//		ISayable sayable= new ISayable() {
//
//			@Override
//			public void say() {
//				System.out.println("I AM SAYABLE");
//				
//			}	
//		};
		ISayable sayable= () -> System.out.println("I AM SAYABLE");
//		sayable.say();
		
		sayHello(sayable);
	}
	
	private static void sayHello(ISayable sayable)
	{
		sayable.say();
	}

}
