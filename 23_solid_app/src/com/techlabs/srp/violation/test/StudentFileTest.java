package com.techlabs.srp.violation.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentFileTest {

	public static void main(String[] args) {
		try {
			FileReader filereader= new FileReader("D:\\AurionPro_Training\\23_solid_app\\src\\com\\techlabs\\srp\\violation\\test\\students.txt");
			int i;
			try {
				while((i=filereader.read())!=-1)
				{
					System.out.print((char)i);
				}
				filereader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	}

}
