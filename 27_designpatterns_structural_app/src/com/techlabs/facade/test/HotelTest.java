package com.techlabs.facade.test;

import com.techlabs.facade.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
		
		HotelReception reception = new HotelReception();
		reception.getIndianMenu();
		System.out.println("\n");
		reception.getItalianMenu();

	}

}
