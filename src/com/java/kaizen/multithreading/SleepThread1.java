package com.java.kaizen.multithreading;

public class SleepThread1 extends Thread{
	
	public void run () {
		for (int i=1; i<=5; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		SleepThread1 s = new SleepThread1();
		s.start();
	}
	

}
