package com.techlabs.facade.model;

public class IndianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		IMenu menu = new IndianMenu();
		return menu;
	}
	

}
