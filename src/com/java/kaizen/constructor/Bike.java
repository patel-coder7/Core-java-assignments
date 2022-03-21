package com.java.kaizen.constructor;

public class Bike {

	String name;
	String model;
	int price;
	int avarage;
	
	public Bike() {
	System.out.println("Non Paramter");
	}
	public Bike (int price,int avarage,String name,String model) {
		System.out.println("paramter");
		this.name = name;
		this.model = model;
		this.price = price;
		this.avarage = avarage;
		
	
	}
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.name = "since";
		bike.model ="Honda";
		bike.price = 96000;
		bike.avarage = 50;
		
		bike.describeBike();
		Bike levo = new Bike (70000,45,"levo","Honda");
		levo.describeBike();
		
}
	public void describeBike() {
		System.out.println("Bike [name=" + name + ", model=" + model + ", price=" + price + ", avarage=" + avarage + "]");
	}
}
	