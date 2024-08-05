package com.techlabs.test;

import com.techlabs.model.AccountObjectCounter;

public class AccountObjectCounterTest {

	public static void main(String[] args) {
		AccountObjectCounter objcounter1= new AccountObjectCounter();
		AccountObjectCounter.counter();
		AccountObjectCounter objcounter2= new AccountObjectCounter();
		AccountObjectCounter.counter();
		AccountObjectCounter objcounter3= new AccountObjectCounter();
		AccountObjectCounter.counter();
		AccountObjectCounter objcounter4= new AccountObjectCounter();
		AccountObjectCounter.counter();
		

	}

}
