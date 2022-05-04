package com.java.kaizen.multithreading;

public class Fan implements Runnable  {

	@Override
	public void run() {
		System.out.println("Fan is the Best ");
		System.out.println("Fan is Blue colour");
	}
	public static void main(String[] args) {
		
		Fan n = new Fan();
		
		Thread e = new Thread(n);
		e.start();
	}

}
