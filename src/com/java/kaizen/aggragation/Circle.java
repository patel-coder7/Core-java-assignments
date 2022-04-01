package com.java.kaizen.aggragation;

public class Circle {
	
	Operation op;
	
	public double area(int r) {
		op = new Operation ();
		int squ = op.square(r);
		return Math.PI*squ;
		
				}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		
		double d = c.area(12);
		System.out.println(d);
	}
	
	

}
