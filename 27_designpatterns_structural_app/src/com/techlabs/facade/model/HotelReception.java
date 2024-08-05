package com.techlabs.facade.model;

public class HotelReception {

	
	public void getIndianMenu()
	{
	IHotel indHotel = new IndianHotel();
	IMenu menu = indHotel.getMenu();
	menu.displayMenu();
	}
	
	public void getItalianMenu()
	{
	IHotel italyHotel = new ItalianHotel();
	IMenu menu = italyHotel.getMenu();
	menu.displayMenu();
	}
	

}
