package com.java.kaizen.multithreading;

public class Bags implements Runnable {

	@Override
	public void run() {
		System.out.println("Bags is the important");
	}
	public static void main(String[] args) {
		Bags s = new Bags ();
		Thread b = new Thread(s);
		Bags a = new Bags();
		Thread c = new Thread (a);
		
		b.start();
		c.start();
	}

}
