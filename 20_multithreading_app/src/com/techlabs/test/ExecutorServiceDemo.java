package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class ExecutorServiceDemo {
	
	public static void main(String[] args) {
		
		int corecount= Runtime.getRuntime().availableProcessors();
		System.out.println("AVAILABLE PROCESSORS: "+corecount);
		
//		ExecutorService service = Executors.newFixedThreadPool(corecount);
//		ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newSingleThreadExecutor();
	
		for(int i=0;i<1000;i++)
			service.execute(new Task());
	}
}