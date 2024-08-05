package com.techlabs.solution.test;

import com.techlabs.solution.model.ILabour;
import com.techlabs.solution.model.IWorker;
import com.techlabs.solution.model.Labour;
import com.techlabs.solution.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		ILabour worker1= new Labour();
		IWorker worker2= new Robot();
		
		worker1.startWork();
		worker1.stopWork();
		worker1.eat();
		worker1.drink();
		
		worker2.startWork();
		worker2.stopWork();

		

	}

}
