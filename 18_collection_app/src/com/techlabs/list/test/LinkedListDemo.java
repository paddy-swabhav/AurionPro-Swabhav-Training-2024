package com.techlabs.list.test;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
	
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("PADDY");
		list.add("SOVA");
		list.addFirst("RAZE");
		list.addLast("REYNA");
		
		System.out.println(list);
		
		
	}
	
}
