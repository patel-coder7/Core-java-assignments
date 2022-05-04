package com.java.kaizen.multithreading;

public class Laptop implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable to Thread ");
		
	}
	public static void main(String[] args) {
		
		Laptop p = new Laptop();
		
		Thread d = new Thread(p);
		
		d.start();
	}

}
