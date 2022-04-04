package com.java.kaizen.inheritance;

public class Car  extends Vahicle{
	
	public Car() {
		super();
		super.applyBrackes();
		super.capacity();
		
	}
	public void show() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.show();
	}

}
