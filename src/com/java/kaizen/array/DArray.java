package com.java.kaizen.array;

import java.util.Scanner;

public class DArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rows  = sc.nextInt();
		int columns = sc.nextInt();
		
		int number [][] = new int[rows][columns];
		//input
		//rows
		for (int i=0;i<rows;i++) {
			//columns
			for(int j=0;j<columns;j++) {
				number [i][j]= sc.nextInt();
			}
			
		}
		//output
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				System.out.println(number[i][j]+ " ");
			}
			System.out.println("hello");
		}
	}

}
