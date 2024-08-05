package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		
		System.out.println("ENTER THE DETAILS OF STUDENTS: \n");
		System.out.println("ENTER ROLL NO.: ");
		student.setRollno(sc.nextInt());
		System.out.println("ENTER NAME: ");
		student.setName(sc.next());
		System.out.println("ENTER AGE: ");
		student.setAge(sc.nextInt());
		System.out.println("ENTER PERCENTAGE: ");
		student.setPercentage(sc.nextFloat());
		
		
		
		System.out.println("\n\nDETAILS OF THE STUDENTS ARE:\n");
		System.out.println("ROLL NO.: "+student.getRollno());
		System.out.println("NAME: "+student.getName());
		System.out.println("AGE: "+student.getAge());
		System.out.println("PERCENTAGE: "+student.getPercentage()+" %tele");
		
		
	}

}
