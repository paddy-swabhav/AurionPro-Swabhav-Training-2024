package com.techlabs.creational.builder.test;

import com.techlabs.creational.builder.model.Phone;
import com.techlabs.creational.builder.model.PhoneBuilder;

public class PhoneShop {

	public static void main(String[] args) {
		
		Phone phone = new PhoneBuilder().setOs("Android").setRam(8).build();
		
		System.out.println(phone);
	}
}
