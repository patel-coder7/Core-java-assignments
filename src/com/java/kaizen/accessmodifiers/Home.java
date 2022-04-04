package com.java.kaizen.accessmodifiers;

public class Home {

	public void display () {
		System.out.println("in the public method  ");
	}
	void  some() {
		System.out.println("the default method ");
	}
	private void see() {
		System.out.println("the private method");
	}
	protected void show() {
		System.out.println("the protected");
	}
}
