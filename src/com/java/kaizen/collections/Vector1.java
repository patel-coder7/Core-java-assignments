package com.java.kaizen.collections;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<String> vt = new Vector<String>();
		vt.add("Rahul");
		vt.add("Abhi");
		vt.add("Rudr");
		
		List<String> lst = vt.subList(1,2);
		for (int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
			
		vt.equals(vt);
		System.out.println();
		
        vt.toString();
        System.out.println(vt);
		}
		}
}