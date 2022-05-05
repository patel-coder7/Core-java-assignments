package com.java.kaizen.multithreading;

public class YieldMethod3 extends Thread{
	
	public void run() {
		Thread.yield();
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
	}

	public static void main(String[] args) {
		
		YieldMethod3 ym = new YieldMethod3 ();
		ym.start();
		
		for (int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
	}
}
