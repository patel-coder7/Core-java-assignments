package com.java.kaizen.multithreading;

public class YieldMethod1 extends Thread {
	
	public void run () {
//		Thread.yield();
		
		System.out.println(Thread.currentThread().getName()+" "+ "Hello World");
		System.out.println("Arp");
		
	}
	public static void main (String agrs[]) {
		
		YieldMethod1 ym = new YieldMethod1();
		
		ym.start();
		Thread.yield();
		
		System.out.println(Thread.currentThread().getName()+" "+"Sumit");
	//	Thread.yield();
	}

}
