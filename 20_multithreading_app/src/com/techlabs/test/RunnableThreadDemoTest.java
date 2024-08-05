package com.techlabs.test;

import com.techlabs.thread.RunnableThread;

public class RunnableThreadDemoTest {

	public static void main(String[] args) {
		RunnableThread thread1= new RunnableThread("Thread1");
		
		for(int i=5;i>0;i--)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		Thread thread1= new Thread(new RunnableThread("Thread1"));
//		thread1.start();

		try {
			thread1.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
