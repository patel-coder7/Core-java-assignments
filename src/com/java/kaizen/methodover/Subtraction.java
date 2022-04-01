package com.java.kaizen.methodover;

public class Subtraction {
	
	public Subtraction(int i,float f) {
		System.out.println(i-f);
		
	}
	
	public void Sutraction (float f, long l) {
		System.out.println(f-l);
		
	}
	public void Subtraction(int j, long k,float r) {
		System.out.println(j-k-r);
		
	}
	public static void main(String[] args) {
		Subtraction op =  new Subtraction(0, 0);
		op.Subtraction(5, 8, 9);
		op.Sutraction(11.3f, 12);
		op.Sutraction(12.2f,34);
	}

}
