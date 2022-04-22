package com.java.kaizen.collections;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		
		TreeMap<String,Integer>  tm = new TreeMap<String ,Integer>();
		
		tm.put("Rajat", 10);
		tm.put("Sumit", 20);
		tm.put("Ranveer", 30);
		tm.put("Nayan", 40);
		tm.put("siya", null);
		tm.put("Riya",null );
		
		System.out.println(tm);
		
    	NavigableSet set1=tm.descendingKeySet();
		System.out.println(set1);
		
		NavigableMap set2 = tm.descendingMap();
		System.out.println(set2);
		
       tm.firstKey();
    	System.out.println(tm);
    	
	}

}
