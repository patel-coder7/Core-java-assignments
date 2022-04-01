package com.java.kaizen.staticc;

import java.util.Scanner;

public class StaticMarks {

	int Marks;
	static String colour;
	static String male;
	Scanner in = new Scanner(System.in);
	public StaticMarks() {
		System.out.println("Hello");
		Marks = in.nextInt();
		this.Marks = Marks;
	}
	
	public void show() {
		System.out.println(Marks);
		System.out.println(colour );
		System.out.println(male);
	}
	
	public static void main(String[] args) {
		
		StaticMarks ph = new StaticMarks();
		
		ph.Marks = 75;
		ph.colour = "Black";
		ph.male = "Ram";
		ph.show();
		
	}
}
