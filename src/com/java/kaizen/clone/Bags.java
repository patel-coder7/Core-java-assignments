package com.java.kaizen.clone;

public class Bags implements Cloneable {
	
	int price;
	int id;
	String name;
	
	Bags(){
		System.out.println(" ");
	}
	@Override
	public String toString() {
		return "Bags [price=" + price + ", id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Bags b = new Bags();
		b.id = 12;
		b.name = "Prabhat";
		b.price = 2100;
		
		System.out.println(b.id);
		System.out.println(b.name);
		System.out.println(b.price);
		
		Bags b1 = (Bags) b.clone();
		System.out.println(b1);
		
		System.out.println(b.toString());
	}
	
	}
	
		
	
	


