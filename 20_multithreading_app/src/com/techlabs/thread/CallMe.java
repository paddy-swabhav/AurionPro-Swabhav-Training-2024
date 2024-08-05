package com.techlabs.thread;

public class CallMe {
	public synchronized void call(String message)
	{
		System.out.print("["+message);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
