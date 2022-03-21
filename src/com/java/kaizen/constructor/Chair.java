package com.java.kaizen.constructor;

public class Chair {

	int price;
	String Brand;
	String colour;
	
	public Chair () {
		System.out.println("Non paramter");
		}
	public Chair (int price , String Brand , String colour) {
		System.out.println("paramter");
		this.Brand = Brand;
		this.price = price;
		this.colour = colour;
		
	}
	public static void main(String[] args) {
		Chair chair = new Chair();
		
		chair.price = 500;
		chair.Brand = "Intex";
		chair.colour = "Blue";
		
		chair. describeChair();
		
		
	}
	public void describeChair() {
		System.out.println( "Chair [price=" + price + ", Brand=" + Brand + ", colour=" + colour + "]");
	}
}