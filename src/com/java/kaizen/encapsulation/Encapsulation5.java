package com.java.kaizen.encapsulation;

import java.util.Scanner;

public class Encapsulation5 {

	private int marks;
	private String name;
	Scanner in = new Scanner(System.in);
	public void setmarks(int marks) {
		
		System.out.println("hello");
		marks = in.nextInt();
		this.marks = marks;
		
	}
	public void setname(String name) {
		name = in.next();
		this.name = name;
		
	}
	public int getmarks() {
		return marks ;
	}
	public String getname () {
		return name;
	}
	
}
