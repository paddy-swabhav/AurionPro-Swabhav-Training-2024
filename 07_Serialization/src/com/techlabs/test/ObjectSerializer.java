package com.techlabs.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializer {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.stRollno=2;
		student1.stName="PADDY";
	
		String filename = "D:\\AurionPro_Training\\07_Serialization\\src\\com\\techlabs\\test\\test.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student1);
			
			oos.close();
			fos.close();
			
			System.out.println("Object Saved in file");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
