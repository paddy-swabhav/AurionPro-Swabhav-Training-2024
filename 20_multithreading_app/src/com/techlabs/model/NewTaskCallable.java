package com.techlabs.model;

import java.util.Random;
import java.util.concurrent.Callable;

public class NewTaskCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return (int)(Math.random()*1000);
	}
	

}
