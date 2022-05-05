package com.java.kaizen.multithreading;

public class SleepThread {
	
	public static void main(String[] args) throws InterruptedException {
//		try {
//			for (int i=1; i<=5; i++) {
//			Thread.sleep(1000);
//			
//			System.out.println(i);
//		}
//		}catch(Exception e) {
//			System.out.println(e);
//		}

		for (int i=1; i<=5; i++) {
			
			Thread.sleep(1000);
			System.out.println(i);
		}
		
	}

}

		