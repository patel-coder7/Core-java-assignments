package com.java.kaizen.methodoveriding;

public class ICIC extends RBI {

	int a = 29;
	
	public ICIC() {
		System.out.println("in ICIC cons");
	}
	public int getRateofInterest() {
		return 10;
	}
	
	public void display () {
		System.out.println(a);
		int a = 19;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
