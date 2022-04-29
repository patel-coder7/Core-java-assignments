package com.java.kaizen.array;

public class SelectionSort1 {

	public static void main(String[] args) {
		
		int[] a= new int[] {23,12,31,45};
		int min;
		int temp=0;
		System.out.println("Array Before sortS");
		
		for (int i=0;i<4;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("After Selection Sort");
		
		for (int i=0;i<a.length;i++) {
			min = i;
			
			for (int j=i+1;j<a.length;j++) {
				
				if (a[j] < a[min]) {
					min= j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
					
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
}
	}

}
