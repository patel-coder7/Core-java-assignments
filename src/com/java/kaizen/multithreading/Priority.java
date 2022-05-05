package com.java.kaizen.multithreading;

public class Priority implements Runnable {
	
	public void run () {
		System.out.println("child thread priority :"+Thread.currentThread().getPriority());
		System.out.println("Child Thread");
		
	}
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		
		System.out.println("main Thread new priority :"+Thread.currentThread().getPriority());
		
		Priority a = new Priority();
		Thread r = new Thread(a);
		r.setPriority(9);
		r.start();
	}

}
