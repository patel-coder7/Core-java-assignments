package com.java.kaizen.methodover;

public class OverLoading {
	
	public void sum(int i, int j) {
		System.out.println(i+j);
	}
	public void sum(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public void sum(int i, float f) {
		System.out.println(i+f);
	}
	
	public static void main(String[] args) {
		
		OverLoading o = new OverLoading();
		o.sum (10,20);
		o.sum(22,12,15);
		o.sum(15, 22.0f);
	}

}
