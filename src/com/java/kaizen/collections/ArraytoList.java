package com.java.kaizen.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArraytoList {
	
	public static void main(String args[]) {
		
		List<String> lst = new ArrayList<String>();
		
		lst.add("Sumit");
	    lst.add("Amit");
	    lst.add("Ranveer");
	
	System.out.println(lst);
	
	lst.add(1,"Pradeep");
	System.out.println(lst);
	
	lst.remove(3);
	System.out.println(lst);
	
	lst.toArray();
	System.out.println(lst);
		
	
	System.out.println(lst.size());
	
//	HashSet<Integer> it =new HashSet<Integer>();
	for(int i=0;i<lst.size();i++) {
		System.out.println(lst);
	}
	}

}
