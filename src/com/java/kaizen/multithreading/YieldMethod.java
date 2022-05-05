package com.java.kaizen.multithreading;

public class YieldMethod extends Thread{
	
	public void run () {
	//	Thread.yield();
		
		for (int i=1; i<=6; i++) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
			
		}
	}
    public static void main(String[] args) {
		
    	YieldMethod m = new YieldMethod();
    	
    	m.start();
    	
   // 	Thread.yield();
    	for (int i=1; i<=6; i++) {
    		Thread.yield();
    		System.out.println(Thread.currentThread().getName()+" "+ i);
    	}
	}

}
