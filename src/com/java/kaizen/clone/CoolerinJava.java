package com.java.kaizen.clone;

import java.util.HashMap;
import java.util.Map;

public class CoolerinJava implements Cloneable {
	
	
	public static void main(String[] args) {
		Map<Integer,String> hs = new HashMap<Integer,String>();
		
		hs.put(03, "Ajju");
		hs.put(05, "Yesh");
		hs.put(04, "Veer");
		
		System.out.println(hs);
		
		try {
			HashMap hs2 =(HashMap) ((HashMap) hs).clone();
			
			System.out.println(hs2);
		}catch(Exception c) {
			System.out.println(c);
		}
		
		
	}

}
