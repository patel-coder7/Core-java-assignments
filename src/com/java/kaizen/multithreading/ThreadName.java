package com.java.kaizen.multithreading;

public class ThreadName {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Sumit");
		System.out.println("New Thread name : " +Thread.currentThread().getName());
	}

}
