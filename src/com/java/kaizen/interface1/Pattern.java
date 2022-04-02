package com.java.kaizen.interface1;

public class Pattern implements Star,Star1 {
	
	public void push() {
		System.out.println("code ");
		
	}
	public void sum() {
		System.out.println("plus");
	}
	public void made() {
		System.out.println("eat");
	}
	
	public static void main(String []args) {
		
		Pattern p = new Pattern();
		p.push();
		p.sum();
		p.made();
	}

}
