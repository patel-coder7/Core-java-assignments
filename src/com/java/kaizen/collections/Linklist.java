package com.java.kaizen.collections;

import java.util.LinkedList;

public class Linklist {
	
	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<String>();
		
		lst.add("amit");
		lst.add("arp");
		lst.add("sunil");
		
		System.out.println(lst);
		
		lst.add(1, "ajay");
		System.out.println(lst);
		
//		System.out.println("After poll");
//		System.out.println(lst.poll());
//		System.out.println(lst);
		
		lst.remove(2);
		System.out.println(lst);
		
		boolean b =lst.isEmpty();
		System.out.println(b);
		
		lst.get(1);
		System.out.println(lst);
		
		lst.lastIndexOf(3);
		System.out.println(lst);
		
		lst.getFirst();
		System.out.println(lst);
		
	}

}
