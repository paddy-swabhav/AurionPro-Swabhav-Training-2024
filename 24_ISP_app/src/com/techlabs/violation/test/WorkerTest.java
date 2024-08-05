package com.techlabs.violation.test;

import com.techlabs.violation.model.IWorker;
import com.techlabs.violation.model.Labour;
import com.techlabs.violation.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker worker1= new Labour();
		IWorker worker2= new Robot();
		
		worker1.startWork();
		worker1.stopWork();
		worker1.eat();
		worker1.drink();
		
		worker2.startWork();
		worker2.stopWork();
		worker2.eat();
		worker2.drink();
		

	}

}
