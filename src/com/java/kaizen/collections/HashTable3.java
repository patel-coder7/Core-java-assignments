package com.java.kaizen.collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable3 {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> st = new Hashtable<String,Integer>();

		st.put("Aaru", 455);
		st.put("Semi", 234);
		st.put("Shepu", 544);
		st.put("Manoj", 675);
		st.put("Vishal", 987);
		
		System.out.println(st);
		
//		System.out.println(st.hashCode());
		
		System.out.println(st.keySet());
		
		System.out.println(st.isEmpty());
	}

}
