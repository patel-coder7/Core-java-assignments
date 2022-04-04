package com.java.kaizen.inheritance;

public class Bus extends Vahicle {
	
	public Bus() {
		super();
		super.capacity();
	}
	public void see() {
		System.out.println("name");
		
	}
	public static void main(String[] args) {
		
		Bus b = new Bus();
		b.applyBrackes();
		b.capacity();
		
	}

}
