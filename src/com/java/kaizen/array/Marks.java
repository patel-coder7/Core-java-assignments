package com.java.kaizen.array;

public class Marks {
	public static void main(String[] args) {
		
		int marks [] = new int [3];
		marks [0]= 94;
		marks [1]= 98;
		marks [2] = 95;
//		
//		System.out.println(marks [0]);
//		System.out.println(marks [1]);
//		System.out.println(marks [2]);
		
		for (int i=0;i<3;i++) {
			System.out.println(marks[i]);
		}
		for (int i=3-1;i>0;i--) {
			System.out.println(marks[i]);
		}
//				
	}

}
