package com.java.kaizen.clone;

import java.util.ArrayList;

public class ArrayLst implements Cloneable {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Ramu");
		ar.add("Gopu");
		ar.add("Rudr");
		
		System.out.println(ar);
	
	try {
		Cloneable ar1 =(Cloneable) ar.clone();
		
		System.out.println(ar1);
		}catch(Exception c) {
			System.out.println(c);
			
		}
	}
}
