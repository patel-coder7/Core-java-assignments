package com.java.kaizen.starpattern;

public class Question3 {

	public static void main(String[] args) {
		
		int a = 5;
		
		for (int i=0;i<=5;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for (int r=1;r<=i;r++) {
	//			for (int r=1;r<(i*2))
				System.out.print("*");
			}
			for (int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
