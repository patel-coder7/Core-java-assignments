package com.java.kaizen.aggragation;

import java.util.Scanner;

import com.java.kaizen.constructor.Bottle;

public class Circle {
	
	Operation op;
	
	public double area(int r) {
		op = new Operation ();
		int squ = op.square(r);
		return Math.PI*squ;
		
				}
	
	public static void main(String[] args) {
	
		
		Bottle b = new Bottle();
		b.describeBottle();
		
		Circle c = new Circle();
		
		double d = c.area(12);
		System.out.println(d);
	}
	
	

}
