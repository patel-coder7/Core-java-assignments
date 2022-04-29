package com.java.kaizen.array;

import java.util.Scanner;

public class BubbleSort3 {
           public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter value");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Array Before sort");
		for(int i =0 ; i<5;i++) {
			System.out.print(arr[i]+" ");
		}
  	System.out.println("After Bubble sort");
		
   	
		
		//bubble sort
		for (int i=0;i<arr.length;i++) {
			
			for (int j=0;j<arr.length;j++) {
				
				if (j + 1 == arr.length) {
					continue;				
			
				}
				if (arr[j] > arr[j+1]) {
					
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				}
		}
			

	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
	}