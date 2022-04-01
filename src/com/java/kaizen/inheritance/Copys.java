package com.java.kaizen.inheritance;

public class Copys extends Books {

	public Copys() {
		super();
		super.price();
		
	}
	public void colour() {
		System.out.println(" in colour");
		System.out.println("Blue");
	}
	
	public static void main(String []args){
		
		Copys c = new Copys();
	    c.colour();
	    c.price();
	}
}

