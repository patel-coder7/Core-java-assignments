package com.java.kaizen.methodoveriding;

public class Teacher {
	int a = 29;
	
	public Teacher() {
		System.out.println ("Best Teacher");
	}
	public final void subject() {
		System.out.println("Marhs");
	}
	public final void subject(int a) {
		}
	public int Marks() {
		return 8;
	}
	public void show() {
		System.out.println(a);
		System.out.println(this.a);
		int a = 45;
		
		System.out.println(a);
		System.out.println(this.a);
		
	}
	
	

}
