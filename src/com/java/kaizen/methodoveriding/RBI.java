package com.java.kaizen.methodoveriding;

public class RBI {

	int a = 56;
	public RBI() {
		System.out.println("Best RBI cons");
		
	}
	public final void see() {
		System.out.println("in see to RBI");
	}
	public final void see (int a) {
		System.out.println("in see to RBI");
	}
	public int  getRateofInterest() {
		return 8;
		
	}
	public void show() {
		System.out.println(a);
		System.out.println(this.a);
		int a = 28;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("in show");
	}
	
}
