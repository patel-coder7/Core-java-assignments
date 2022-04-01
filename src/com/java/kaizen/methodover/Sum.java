package com.java.kaizen.methodover;

public class Sum {
	
	public void Sum(int k,int i) {
		System.out.println(k+i);
	}
	public void Sum(int j,float f) {
		System.out.println(j+f);
	}
	public void Sum(int h,float c,long l) {
		System.out.println(h+c+l);
	}
	public static void main(String[] args) {
		Sum o = new Sum();
		o.Sum(45, 12.0f);
		o.Sum(23, 12);
		o.Sum(10, 20.1f, 30);
	}

}
