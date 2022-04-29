package com.java.kaizen.array;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a= new int[] {5,3,1,6,8};
		int temp,j;
		
		for (int i=1;i<a.length;i++) {
			
			temp = a[i];
			j = i-1;
			while(j>0 && a[i]>temp) {
				
				a[j] = a[j+1];
				j--;
			}
			a[j+1] = temp;
		}
		for (int i=1;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
