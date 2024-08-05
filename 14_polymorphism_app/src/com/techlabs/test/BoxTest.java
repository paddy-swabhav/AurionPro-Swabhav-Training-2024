package com.techlabs.test;

import com.techlabs.model.Base;
import com.techlabs.model.Derived1;
import com.techlabs.model.Derived2;

public class BoxTest {

	public static void main(String[] args) {
		Base base= new Base();
		base.display();
		base= new Derived1();
		base.display();
		base = new Derived2();
		base.display();

	}

}
