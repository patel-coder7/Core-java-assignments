package com.java.kaizen.constructor;

public class Hotal {

	String name;
	String colour;
	int Room;
	int Stap;
	int Floor;
	int Rent;
	
	public Hotal () {
		System.out.println("Non paramter");
		
	}
	public Hotal (String name , String colour , int Room ,int Stap ,int Floor ,int Rent) {
		System.out.println("paramter");
		
		this.colour = colour;
		this.name = name;
		this.Room = Room;
		this.Stap =Stap;
		this.Rent =Rent;
		this.Floor =Floor;
		
	}
	public static void main(String[] args) {
		Hotal hotal = new Hotal();
		hotal.colour = "pink";
		hotal.name = "GK Plassa";
		hotal.Room = 45;
		hotal.Stap = 24;
		hotal.Floor = 6;
		hotal.Rent = 3300;
	
		hotal.describeHotal();
	}
	public void describeHotal() {
		System.out.println( "Hotal [name=" + name + ", colour=" + colour + ", Room=" + Room + ", Stap=" + Stap + ", Floor=" + Floor);
	}
}
	