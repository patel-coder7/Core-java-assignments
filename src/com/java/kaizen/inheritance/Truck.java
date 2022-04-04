package com.java.kaizen.inheritance;

public class Truck extends Vahicle {
	
	public Truck() {
		super();
		super.applyBrackes();
		super.capacity();
	}
	public void display() {
		System.out.println("colour");
	}
	public static void main(String[] args) {
		
		Truck t = new Truck();
		t.display();
	}

}
