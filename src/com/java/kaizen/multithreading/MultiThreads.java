package com.java.kaizen.multithreading;

public class MultiThreads extends Thread {
	
	public void run() {
		System.out.println("Threads ");
		
	}
	public static void main(String[] args) {
		MultiThreads t = new MultiThreads();
		MultiThreads a = new MultiThreads();
	    t.start();
	    a.start();
	}
}
