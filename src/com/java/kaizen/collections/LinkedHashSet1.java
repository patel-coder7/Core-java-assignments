package com.java.kaizen.collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer>  ld = new LinkedHashSet<Integer>();
		
		ld.add(102);
		ld.add(103);
		ld.add(104);
		ld.add(105);
		ld.add(null);
		
		System.out.println(ld);
		
	//	Iterator<Integer> ts = ld.iterator();
//		while(ts.hasNext()) {
//			String str= ts.next();
//			System.out.println(str);
//		}
		for(Integer n : ld) {
			System.out.println(n);
		}
		
		LinkedHashSet<Integer> ld1 = new LinkedHashSet<Integer>();
		System.out.println(ld1);
		System.out.println(ld1.size());

	}

}
