package com.java.kaizen.multithreading;

public class Test extends Thread {
	
	public void run() {
		System.out.println("Thread Task");
		System.out.println("The Best Thred");
	}
	
	public static void main(String[] args) {
		
		Test s = new Test();
		s.start();
	}

}
