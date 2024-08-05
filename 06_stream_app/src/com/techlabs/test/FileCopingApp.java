package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopingApp {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\AurionPro_Training\\06_stream_app\\src\\com\\techlabs\\test\\test1");
			int ch;
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\AurionPro_Training\\06_stream_app\\src\\com\\techlabs\\test\\test2");
			
			while((ch=fileInputStream.read())!=-1)
			{
				fileOutputStream.write(ch);
			}
			System.out.println("FILE COPIED SUCCESSFULLY");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
