package com.java.kaizen.accessmodifiers;

public class Bags extends leptop {
	
	public void display() {
		super.move();
		super.read();
	}
	public static void main(String[] args) {
		
		Bags b = new Bags();
		b.move();
		b.read();
		
	}

}
