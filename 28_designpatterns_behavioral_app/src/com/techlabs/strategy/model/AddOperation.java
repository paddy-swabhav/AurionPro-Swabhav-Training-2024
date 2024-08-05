package com.techlabs.strategy.model;

public class AddOperation implements IOperation{

	@Override
	public int operation(int a, int b) {
		return (a+b) ;		
	}
	
	
}
