package com.techlabs.test;

import com.techlabs.model.Demo;

public class DemoTest {

	public static void main(String[] args) {

		Demo d1=new Demo();
		d1.display();
		d1.increment();
		System.out.println("After Increment d1 \n");
		d1.display();
		
		
		Demo d2=new Demo();
		d2.display();
		d2.increment();
		System.out.println("After Increment d2\n");
		d2.display();
		
		
		Demo d3=new Demo();
		d3.display();
		d3.increment();
		System.out.println("After Increment d3\n");
		d3.display();
	}
	
	static
	{
		System.out.println("GGGGGGGGGGGGGGGGGGG");
	}

}

