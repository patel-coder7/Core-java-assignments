package com.java.kaizen.starpattern;

public class Question5 {

	public static void main(String[] args) {
	
		int a = 5;
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			for (int s=1;s<=5;s++) {
				for (int j=5;j>=s;j--) {
				System.out.print("*");
			}
			System.out.println("");
			}
			
		}
	}
