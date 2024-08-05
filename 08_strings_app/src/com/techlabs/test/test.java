package com.techlabs.test;

public class test {

	public static void main(String[] args) {
//		String name1="PADDY";
//		String name2="PADDY"; 
//		String name3= new String("PADDY");
//		
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());
//		System.out.println(name1);
//		name1=name1+"SOVA";
//		
//		System.out.println(name1.hashCode());
//		System.out.println(name1);
//		
//		System.out.println(name1==name3);
//		
		StringBuffer name4= new StringBuffer("REYNA");
		System.out.println(name4.hashCode());
		name4.append("VIPER");
		System.out.println(name4.hashCode());
		
		
		StringBuilder name5= new StringBuilder("BRIM");
		System.out.println(name5.hashCode());
		name5.append("STONE");
		System.out.println(name5.hashCode());
		
	}

}
