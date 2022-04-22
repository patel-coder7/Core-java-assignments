package com.java.kaizen.collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Ram");	
	    ts.add("Shyam");
	    ts.add("rounak");
	    ts.add("Hariom");
	    ts.add("kunal");
//	    ts.add(null);
	    
	    System.out.println(ts);
	    
	    String temp = "";
	    for(String s: ts) {
	    	System.out.println(s);
	    	temp = temp+s;
	    }
	    System.out.println(temp.trim());
	    System.out.println(ts.first());
	    
	    ts.descendingSet();
	    System.out.println(ts);
	    
	    
	    LinkedHashSet<String> ld = new LinkedHashSet<String>();
	    System.out.println(ld);
	      
	}

}
