package com.java.kaizen.starpattern;

public class Question2 {

	public static void main(String[] args) {
		int a =5;
		
		for(int i=1;i<=5;i++) {
			
			for (int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
