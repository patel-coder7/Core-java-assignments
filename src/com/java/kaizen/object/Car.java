package com.java.kaizen.object;

public class Car {
	String name;
	String model;
	String colour;
	
	public Car() {
		System.out.println("Non paramter");
		
	}
	public Car(String name,String model,String colour) {
		System.out.println("paramter");
		this.name = name;
		this.model = model ;
		this.colour = colour;
	}
	public static void main(String[] args) {
		Car car =new Car();
		car.colour =" Blue";
		car.name = "Niose";
		car.model = "Hyundai";
		car.describeCar();
		car.colour =" Red";
		car.name = "Niose";
		car.model = "Hyundai";
		car.describeCar();
		Car Benz = new Car("Benz","xyz","Black");
		Benz.describeCar();
		
}
	public void describeCar() {
	System.out.println("Car [name=" + name + ", model=" + model + ", colour=" + colour + "]");	
	}
	
	

}
