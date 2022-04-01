package com.java.kaizen.staticc;

public class StaticBike {
	
	static int price;
	static String Brand;
	String colour;
	
	//constryctor
	
	public StaticBike() {
		this.colour = colour;
	}
	public void show () {
		System.out.println(price);
		System.out.println(Brand);
		System.out.println(colour);
		
	}
	public static void main(String[] args) {
		
		StaticBike ps = new StaticBike();
		
		ps.colour = "Orange";
		ps.Brand = "Honda";
		ps.price = 96000;
		
		ps.show();
	}
	

}
