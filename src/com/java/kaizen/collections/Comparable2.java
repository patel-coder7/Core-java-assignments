package com.java.kaizen.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2 {

	public static void main(String[] args) {
		
		List<Student1> lt= new ArrayList<Student1>();
		
		lt.add(new Student1(234, "Rudr", "Acropolic"));
		lt.add(new Student1(908, "Servesh", "ITI"));
		lt.add(new Student1(304, "Semi", "MIST"));
		
		System.out.println(lt);
		Collections.sort(lt);
		System.out.println(lt);
		
		System.out.println(lt.size());
		System.out.println(lt.lastIndexOf(lt));

	}

}
