package com.java.kaizen.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(201, "Sumit");
		m.put(202, "Amit");
		m.put(203, "Mohit");
		m.put(204, "AAru");
		m.put(null, null);
	
	    System.out.println(m);

//		m.remove(201);
//		System.out.println(m);
		
		System.out.println(m.get(202));
		System.out.println(m.getOrDefault(206," Ajay"));
		
		System.out.println(m);
		
		
		for (Map.Entry mp : m.entrySet());{
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		m.size();
		System.out.println(m);
		}
		
	}

}
