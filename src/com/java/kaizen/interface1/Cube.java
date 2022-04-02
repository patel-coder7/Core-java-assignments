package com.java.kaizen.interface1;

public class Cube implements Triangle {
	
	public void see(){
		System.out.println("Area of Circle");
	}
	public void read() {
		System.out.println("Angle of Triangle");
		
	}
	public static void main(String []args) {
		
		Triangle t;
		t = new Cube();
		t.see();
		t.read();
		
	}
	

}
