package com.java.kaizen.collections;

import java.util.List;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		
		List<String> ls = new Vector<String>();
		
		ls.add("Gagan");
		ls.add("Anop");
		ls.add("Aman");
		ls.add(null);
		
		System.out.println(ls);
		
		System.out.println(ls.addAll(ls));

	}

}
