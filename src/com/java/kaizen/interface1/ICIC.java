package com.java.kaizen.interface1;

public class ICIC implements Triangle{
	
	
	public void read() {
		System.out.println("maths");
	}
	public void see() {
		System.out.println("befor");
	}
	
	public static void main (String[]args) {
		
		Triangle t;
		t = new ICIC();
		t.read();
		t.see();
		
	}
	

}
