package com.java.kaizen.multithreading;

public class PriorityThread extends Thread {
	
	public void run () {
		System.out.println("child Thread");
		System.out.println("child Thread priority:"+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		System.out.println("main Thread old priority :"+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		
		System.out.println("main Thread new priority:"+ Thread.currentThread().getPriority());
		
		
		
		PriorityThread r = new PriorityThread();
		r.setPriority(MIN_PRIORITY);
		r.start();
	}

}
