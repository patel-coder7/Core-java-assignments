package com.java.kaizen.methodoveriding;

public class Student extends Teacher {

	int a = 40;
	
	public Student() {
		System.out.println("i am Student");
		}
	public void age() {
		System.out.println(21);
	}
	public int marks() {
		System.out.println(55);
		return 10;
	}
	public void display() {
		System.out.println(a);
		System.out.println(this.a);
		int a = 35;
		System.out.println(a);
		System.out.println(super.a);
	}
}
