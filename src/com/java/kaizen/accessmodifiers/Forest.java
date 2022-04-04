package com.java.kaizen.accessmodifiers;

public class Forest {

	public void made() {
		System.out.println("in public method ");
	}
	void some() {
		System.out.println("in default");
	}
	protected void sum() {
		System.out.println("in protected");
	}
	private void dis() {
		System.out.println("in private");
	}
}
