package com.java.kaizen.array;

public class Marks {
	public static void main(String[] args) {
		
		int marks [] = new int [3];
		marks [0]= 94;
		marks [1]= 98;
		marks [2] = 95;
        int n =3;		
//		System.out.println(marks [0]);
//		System.out.println(marks [1]);
//		System.out.println(marks [2]);
		
        System.out.println("print the value");
		for (int i=0;i<n;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("Reverse the value");
		for (int i=n-1;i>=0;i--) {
			System.out.println(marks[i]);
		}
//				
	}

}
