package com.techlabs.sets.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<String>();
		
		set.add("paddy");
		set.add("sova");
		set.add("raze");
		set.add("paddy");
		
		System.out.println(set);
		
		
		LinkedHashSet<String> set1= new LinkedHashSet<String>();
		
		set1.add("paddy");
		set1.add("sova");
		set1.add("raze");
		set1.add("paddy");
		
		System.out.println(set1);
		
		
		TreeSet<String> set2= new TreeSet<String>();
		
		set2.add("paddy");
		set2.add("sova");
		set2.add("raze");
		set2.add("paddy");
		
		System.out.println(set2);
	}

}
