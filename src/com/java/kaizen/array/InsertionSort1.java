package com.java.kaizen.array;

public class InsertionSort1 {
	public static void main(String[] args) {
		
		int[] ar = {4,8,6,9,1};
		int temp,j;
		
		for (int i=1; i<ar.length;i++) {
			
			temp = ar[i];
			j=i;
			
			while (j>0 && ar[j-1]>temp) {
				ar[j] = ar[j-1];
				j = j-1;
			}
			ar[j] = temp;
		}
		for (int i=1;i<ar.length;i++) {
		   System.out.println(ar[i]);	
		}
	}

}
