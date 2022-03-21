package com.java.kaizen.array;

public class Question1 {

	private static final int s = 0;

	public static void main(String[] args) {
	


		
		int arr []  = new int[s];
		
		int temp = 2;
		for (int i=0;i<arr.length;i++) {
			arr[i] = temp;
			temp = temp + 2;
			
		}
		for (int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		}
}
