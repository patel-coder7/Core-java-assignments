package com.java.kaizen.methodover;

public class Division {
	
	public void Division(int i, int j,float f) {
		System.out.println(i/j/f);
	}

	public void Division (int i, float d) {
		System.out.println(i/d);
	}
	public void Division(int i, long l) {
		System.out.println(i/l);
	}
	public void Division (float f, long l) {
		System.out.println(f/l);
	}
	
	public static void main(String[] args) {
		Division o = new Division();
		o.Division (12,2,2.5f);
		o.Division(4, 12.2f);
		o.Division(12,34);
		o.Division(23.2f, 34);
		
	}

}
