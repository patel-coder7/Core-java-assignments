package com.java.kaizen.accessmodifiers;

public class AccessModifierr1 extends AccessModifiersAll {
	
	public void show() {
		super.defaults();
		super.sum();
		super.publics();
	}
	public void publics() {
		System.out.println("publics");
	}
	
	void defaults() {
		System.out.println("default");
	}
	protected void sum() {
		System.out.println("protected");
	}
	
	
}
