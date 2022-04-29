package com.java.kaizen.array;

public class BubbleSort2 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {20,10,80,50,30,12};
	     
		System.out.println("Array Before Bubble sort");

		System.out.println("After Bubble Sorting");
		
		//Bubble sort
		for (int i=0;i<arr.length;i++) {
			
			for (int j=0;j<arr.length;j++) {
				
				if (j+1 == arr.length) {
					continue;
				}
				if (arr[j] < arr[j+1]) {
					
					int temp = arr[j];
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
