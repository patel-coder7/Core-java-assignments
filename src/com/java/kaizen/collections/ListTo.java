package com.java.kaizen.collections;

import java.util.ArrayList;

public class ListTo {
	
	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Amit");
		obj.add("Rudr");
		obj.add("bhup");
		
		System.out.println(obj);
		
		obj.contains(1);
		System.out.println(3);
		
		obj.lastIndexOf(args);
		System.out.println();
		
		System.out.println(obj.size());
		for (int i=0;i<obj.size();i++) {
			System.out.println(obj);
		}
		
		
	}

}
