package com.techlabs.thread;

public class MyThread extends Thread{

	public MyThread(String name)
	{
		super(name);
		start();
	}
	
	public void run()
	{
		for(int i=5;i>0;i--)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
