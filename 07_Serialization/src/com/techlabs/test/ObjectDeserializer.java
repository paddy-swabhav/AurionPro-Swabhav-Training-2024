package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializer {

	public static void main(String[] args) {
		String filename = "D:\\AurionPro_Training\\07_Serialization\\src\\com\\techlabs\\test\\test.txt";
		
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			Student obj = (Student)ois.readObject();
			System.out.println(obj.stRollno);
			System.out.println(obj.stName);
			
			ois.close();
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
