package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Computer;
import com.techlabs.model.Config;
import com.techlabs.model.Harddisk;

public class ComputerTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Computer computer = context.getBean(Computer.class);
		System.out.println(computer);
	}

}
