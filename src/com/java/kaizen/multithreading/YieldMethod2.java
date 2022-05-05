package com.java.kaizen.multithreading;

public class YieldMethod2 implements Runnable {
	
	public void run () {
		
		for (int i=0; i<=2*4; i++) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
		}
        public static void main(String[] args) {
	   YieldMethod2 y = new YieldMethod2();
	   Thread e = new Thread(y);
	   
//	   Thread.yield();
	   e.start();
	   for (int i=0; i<=2*4; i++ ) {
		   Thread.yield();
		   System.out.println(Thread.currentThread().getName()+" "+ i);
	   }
}
}
