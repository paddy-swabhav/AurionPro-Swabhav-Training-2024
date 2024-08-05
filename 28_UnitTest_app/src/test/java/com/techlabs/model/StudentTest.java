package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	
	private IStudentService studentService;
	private Student student;
	
	@BeforeEach
	void init()
	{
		studentService= Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}

	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getMarks()).thenReturn(650.0);
		Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10.0);
		
		assertEquals(65.0,student.calculatePercentage());
	}

}
