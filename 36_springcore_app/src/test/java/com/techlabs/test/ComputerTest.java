package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Computer;
import com.techlabs.model.Harddisk;

public class ComputerTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Harddisk disk = (Harddisk) context.getBean("harddisk","Harddisk.class");
		System.out.println(disk);
		
		Computer computer = (Computer) context.getBean("computer","Computer.class");
		System.out.println("\n\n"+computer);
	}

}
