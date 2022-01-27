package com.simplylearn.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "sonam");
		map.put(2, "Prince");
		map.put(3, "akshita");
		map.put(4, null);
		map.put(null, "test");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Map.Entry entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
