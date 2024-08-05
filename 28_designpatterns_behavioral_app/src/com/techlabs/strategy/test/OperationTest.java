package com.techlabs.strategy.test;

import com.techlabs.strategy.model.AddOperation;
import com.techlabs.strategy.model.MultiplyOperation;
import com.techlabs.strategy.model.OperationStrategy;

public class OperationTest {

	public static void main(String[] args) {
		OperationStrategy strategy = new OperationStrategy(new AddOperation());
		
		strategy.doOperation(20, 10);
		
		strategy.setOperation(new MultiplyOperation());
		strategy.doOperation(10, 5);
	}

}
