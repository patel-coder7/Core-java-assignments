package com.java.kaizen.starpattern;

public class Question4 {

	public static void main(String[] args) {
		
		int a = 5;
		
		for (int i=1;i<=5;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for (int r=1;r<=i;r++) {
			System.out.print("*");
		}
		System.out.println(" ");
		}
	}

}
