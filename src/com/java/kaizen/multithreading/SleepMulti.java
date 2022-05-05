package com.java.kaizen.multithreading;

public class SleepMulti extends Thread{

	public void rum() {
		try {
			for (int i=1; i<=10; i++) {
				System.out.println(i);
				Thread.sleep(100);
			}
		}catch(Exception e ) {
			System.out.println(e);
		}
	}
	public static void main(String args []) {
		
		SleepMulti ml = new SleepMulti();
		SleepMulti ms = new SleepMulti();
		
		ml.start();
		ms.start();
	}
}
