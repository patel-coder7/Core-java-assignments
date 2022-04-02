package com.java.kaizen.interface1;

public class Himan implements InterFaceB,InterFaceC {
	
	//override
	public void get() {
		System.out.println("Hello");
	}
	public void display() {
		System.out.println("Ranveer");
	}
	public static void main (String []args) {
		
		Himan h = new Himan();
		h.get();
		h.display();
	}

}
