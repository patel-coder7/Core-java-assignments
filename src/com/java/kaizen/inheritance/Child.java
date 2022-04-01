package com.java.kaizen.inheritance;

public class Child extends Parents {

	public Child()  {
		super();
		super.Home();
	}
	public void age() {
		System.out.println("age");
		System.out.println(21);
	}
	public static void main(String []args ) {
		
		Child c = new Child();
		c.age();
	}
	
}
