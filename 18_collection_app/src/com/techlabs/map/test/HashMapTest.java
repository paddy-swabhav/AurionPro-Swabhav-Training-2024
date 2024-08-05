package com.techlabs.map.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
		map.put(5, "Paddy");
		map.put(4, "Sova");
		map.put(7, "Raze");
		map.put(1, "Reyna");
		
		System.out.println(map);
		
		Set<Entry<Integer,String>> enteries=map.entrySet();
		
		for(Entry<Integer,String> entry:enteries)
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		
//		LinkedHashMap<Integer,String> map1= new LinkedHashMap<Integer,String>();
//		
//		map1.put(5, "Paddy");
//		map1.put(4, "Sova");
//		map1.put(7, "Raze");
//		map1.put(1, "Reyna");
//		
//		System.out.println(map1);
//		
//		
//		TreeMap<Integer,String> map3= new TreeMap<Integer,String>();
//		
//		map3.put(5, "Paddy");
//		map3.put(4, "Sova");
//		map3.put(7, "Raze");
//		map3.put(1, "Reyna");
//		
//		System.out.println(map3);
	}

}
