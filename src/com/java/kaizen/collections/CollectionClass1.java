package com.java.kaizen.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass1 {

	public static void main(String[] args) {
	
		ArrayList<String> cl = new ArrayList<String>();
		
		cl.add("Ajay");
		cl.add("Vivky");
		cl.add("Ramu");
		cl.add("Betu");
//		cl.add(null);
		
//		Collections.addAll(cl, "deepu","Vijay");
		System.out.println(cl);
				
		Collections.sort(cl);
		System.out.println(cl);
		
//		String st[] = {"eftv","dghtu","indtj"};
//		System.out.println(st);		
				

	}

}
