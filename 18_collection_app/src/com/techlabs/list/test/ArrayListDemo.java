package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("paddy");
		list.add("sova");
		
		System.out.println(list);
		list.add(1, "reyna");
		System.out.println(list);
		
		
		list.add(1, "Geeko");
		System.out.println(list);
		
//		list.add(50);
//		System.out.println(list);
		
		list.remove("geeko");
		System.out.println(list);
		
		System.out.println(list.contains("Geeko"));
		
		System.out.println("\nNormal For");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("\nAdvance For");
		for(String name:list)
			System.out.println(name);
		
		System.out.println("\nIterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("\nList Iterator forward");
		ListIterator<String> listiterator = list.listIterator();
		while(listiterator.hasNext())
			System.out.println(listiterator.next());
		
		System.out.println("\nList Iterator Backwards");
		while(listiterator.hasPrevious())
			System.out.println(listiterator.previous());
		
	}


}
