package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAnalyzer {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\AurionPro_Training\\06_stream_app\\src\\com\\techlabs\\test\\test1");
			int ch,word=1,characters=0,line=1;
			
			while((ch=fileInputStream.read())!=-1)
			{
				characters++;
//				System.out.print((char)ch);
				if(ch==' ' || ch=='\t' || ch=='\n')
				word++;
				if(ch=='\n')
				{
					line++;
				}
			}
			System.out.println("THERE ARE: "+characters+" CHARACTERS");
			System.out.println("THERE ARE: "+word+" WORDS");
			System.out.println("THERE ARE: "+line+" LINES");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
