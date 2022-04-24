package com.java.kaizen.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections2 {

	public static void main(String[] args) {
      
		List<String>  lt= new ArrayList<String>();
		
		lt.add("Ajay");
		lt.add("Vivky");
		lt.add("Ramu");
		lt.add("Betu");
//		lt.add(null);
		
		Collections.sort(lt);
		System.out.println(lt);
		
//		System.out.println(lt.remove("Betu"));
	
		System.out.println(lt.set(1, "Ajay"));
		
		System.out.println(lt.toString());
		
		

	}

}
