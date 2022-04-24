package com.java.kaizen.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable2 {

	public static void main(String[] args) {
     
		Map<Integer,String> m = new Hashtable<Integer,String>();
		
		m.put(101, "Ram");
		m.put(201, "Rohit");
		m.put(301, "Hariom");
		m.put(401, "Mahi");
		m.put(501, "Rudr");
		
		System.out.println(m);
		
		System.out.println(m.size());
		
		System.out.println(m.containsKey(args));
		
		System.out.println(m.equals(m));
		
		for (Map.Entry p : m.entrySet()) {
			System.out.println(p.getKey());
			System.out.println(p.getValue());
		}

	}

}
