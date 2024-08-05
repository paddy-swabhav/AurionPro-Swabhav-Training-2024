package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.Student;
import com.techlabs.list.model.StudentComparator;
import com.techlabs.list.model.StudentNameComparator;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		List<Student> students= new ArrayList<Student>();
		
		students.add(new Student("sova",9,95));
		students.add(new Student("paddy",3,67));
		students.add(new Student("raze",1,90));
		students.add(new Student("yoru",12,87));
		
		displayStudents(students);
		
		Collections.sort(students, new StudentComparator.RollnoComparator());
		System.out.println("\nSorted Student LIst(ROLL NO): ");
//		readStudents(scanner,students);
		displayStudents(students);
		
		Collections.sort(students, new StudentComparator.StudentPercentageComparator());
		System.out.println("\nSorted Student LIst(PERCENTAGE): ");
//		readStudents(scanner,students);
		displayStudents(students);
		
		Collections.sort(students, new StudentComparator.StudentNameComparator());
		System.out.println("\nSorted Student LIst(NAME): ");
//		readStudents(scanner,students);
		displayStudents(students);
	}
	
//	private static void readStudents(Scanner scanner,List<Student> students)
//	{
//		for(int i=0;i<3;i++)
//		{
//			System.out.println("ENTER NAME: ");
//			String name=scanner.next();
//			System.out.println("ENTER ROLL NO: ");
//			double rollno=scanner.nextDouble();
//			System.out.println("ENTER PERCENTAGE: ");
//			float percentage=scanner.nextFloat();
//			students.add(new Student(name,rollno,percentage));
//		}
//	}
	
	private static void displayStudents(List<Student> students)
	{
		System.out.println("THE LIST OF STUDENTS IS: ");
		for(Student student:students)
			System.out.println(student);
	}

}
