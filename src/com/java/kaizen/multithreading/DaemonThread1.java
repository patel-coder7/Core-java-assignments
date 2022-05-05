package com.java.kaizen.multithreading;

public class DaemonThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		
		System.out.println("Daemon Thread");
		
	}
	public static void main (String args []) {
		
		System.out.println("main Thread");
		
		DaemonThread t = new DaemonThread ();
		Thread a = new Thread(t);
		
		a.setDaemon(true);
		a.start();
	}

}
