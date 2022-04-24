package com.java.kaizen.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionProgram2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new  ArrayList<Integer>();
		
		al.add(20);
		al.add(35);
		al.add(60);
		al.add(75);
		al.add(90);
		
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));

	}

}
