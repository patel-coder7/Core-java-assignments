package com.java.kaizen.constructor;

public class Bottle {

	String Brand;
	String colour;
	int Size;
	int Price;
	
	public Bottle () {
		System.out.println("Non paramter");
		
	}
	public Bottle (String Brand,String colour ,int Size, int price) {
		System.out.println("paramter");
		
		this.Brand = Brand;
		this.colour = colour;
		this.Size = Size;
		this.Price = Price;
		
	}
	public static void main(String[] args) {
		Bottle bottle = new Bottle();
		
		bottle.Brand = "Time pass";
		bottle.colour ="grey";
		bottle.Size = 10;
		bottle.Price = 68;
		
		bottle.describeBottle();
		
	}
	public void describeBottle() {
		System.out.println( "Bottle [Brand=" + Brand + ", colour=" + colour + ", Size=" + Size + ", Price=" + Price + "]");
	}
}