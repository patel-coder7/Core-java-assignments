package com.java.kaizen.multithreading;

public class SleepThread2 implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		SleepThread2 sl = new SleepThread2();
		Thread e = new Thread(sl);
		
		e.start();
	}

}
