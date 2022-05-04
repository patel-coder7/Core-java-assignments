package com.java.kaizen.multithreading;

public class Angle extends Thread{
	
	public static void main(String[] args) {
		Home h = new Home ();
		Triangle n = new Triangle();
		
		h.start();
		n.start();
	}

}
