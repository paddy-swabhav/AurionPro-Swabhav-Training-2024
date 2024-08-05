package com.techlabs.strategy.model;

public class MultiplyOperation implements IOperation{

	@Override
	public int operation(int a, int b) {
		return (a*b) ;		
	}
}
