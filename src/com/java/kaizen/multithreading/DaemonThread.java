package com.java.kaizen.multithreading;

public class DaemonThread extends Thread {
	
	public void run () {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		System.out.println("Daemon Thread");
	}
	
	public static void main(String[] args) {
	
		System.out.println("main Thread");
		
		DaemonThread d = new DaemonThread();
		d.setDaemon(true);
		d.start();
	}

}
