package com.techlabs.facade.model;

public class ItalianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		IMenu menu = new ItalianMenu();
		return menu;
	}
	

}
