package com.java.kaizen.array;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr = {38,52,9,18,6,62,13};
		int min;
		int temp;
			System.out.println("Array Before sort");
			
		     for (int i=0;i<7;i++) {
		    	 System.out.print(arr[i]+ " ");
		     }
		     System.out.println("After Salection Sort");
		
		//Selection sort
		for (int i=0;i<arr.length;i++) {
			min =i;
			
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			//Number Swaping
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
