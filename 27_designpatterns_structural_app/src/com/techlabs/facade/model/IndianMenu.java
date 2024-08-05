package com.techlabs.facade.model;

public class IndianMenu implements IMenu{

	String[] MenuItems= {"BUTTER CHIKEN","LACCHA PARATHA"};
	
	@Override
	public void displayMenu() {
		
		System.out.println("*********************INDIAN MENU ********************");
		for(String string: MenuItems)
		{
			System.out.println(string);
		}
		
	}

}
