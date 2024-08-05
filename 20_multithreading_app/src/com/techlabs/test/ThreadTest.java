package com.techlabs.test;

public class ThreadTest {

	public static void main(String[] args) {
		
		Thread thread= Thread.currentThread();
		System.out.println(thread);
		thread.setName("MyThread");
		System.out.println(thread);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(thread.getName()+": "+i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
