package com.java.kaizen.collections;

import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("Rudr");
		h.add("Raman");
		h.add("Kamal");
		h.add("Sumit");
		h.add(null);
		
		System.out.println(h);
//		
//		Iterator<String> ts = h.iterator();
//		while(ts.hasNext()) {
//			String str= ts.next();
//			System.out.println(str);
//		}
		for(String s : h) {
			System.out.println(s);
		}
		

	}

}
