package com.java.kaizen.collections;		

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkHashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> lm = new LinkedHashMap<Integer,String>();
	
	    lm.put(100, "Hemu");
	    lm.put(300, "Abhishek");
	    lm.put(300,"Gabar");
	    lm.put(400,"Dheeraj");
	    lm.put(555, "sibu");
	    lm.put(null, null);
	    
	     System.out.println(lm);
//	
//	     for (Map.Entry mp : lm.entrySet()) {
//				System.out.println(mp.getKey());
//				System.out.println(mp.getValue());
//			}
	     lm.keySet();
	     System.out.println(50);
	     
	}
	
}
