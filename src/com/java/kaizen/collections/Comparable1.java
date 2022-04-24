package com.java.kaizen.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.kaizen.methodoveriding.Student;

public class Comparable1 {

	public static void main(String[] args) {
		
//		List<String> l = new ArrayList<String>();
//		
//		l.add("Ajay");
//		l.add("Rudr");
//		l.add("Kundan");
//		l.add("Semi");
//		
//		System.out.println(l);
//		Collections.sort(l);
//		System.out.println(l);
		
		List<Student1> ls = new ArrayList<Student1>();
		ls.add(new Student1(108, "Sumit", "oriental"));
		ls.add(new Student1(104, "Amit" , "Lnct"));
		ls.add(new Student1(109 , "kalendra",  "Vimal"));
		
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		
		System.out.println(ls.size());
		
	}

}
