package com.java.kaizen.interface1;

public class Rich implements InterFaceB,InterFaceC {
	
	//override
	public void get() {
		System.out.println ("Proparty");
	}
	public void display() {
		System.out.println("Making");
	}
	public static void main(String[]args) {
		
		InterFaceB in;
		in = new Rich();
		in.get();
	}

}
