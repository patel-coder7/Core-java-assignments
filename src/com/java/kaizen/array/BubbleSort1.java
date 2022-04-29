package com.java.kaizen.array;

public class BubbleSort1 {

	public static void main(String[] args) {

		int[] a;
		a = new int[] {36, 19, 29, 12, 5 };

		System.out.println("Array Before Bubble sort");
		System.out.println(a);
		
        //Bubble sort
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (j + 1 == a.length) {
					continue;
				}
				if (a[j] < a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.println(a[i1]);
		}

	}
}