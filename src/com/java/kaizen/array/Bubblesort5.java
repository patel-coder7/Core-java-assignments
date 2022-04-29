package com.java.kaizen.array;

import java.util.Scanner;

public class Bubblesort5 {
	public static void main(String[] args) {
		
		String[] str = new String[3];
		Scanner sc = new Scanner(System.in);
		   for (int i=0;i<3;i++) {
			   System.out.println("enter the value");
			   str [i] = sc.next();					  
		   }
		   System.out.println("after Bubble sort");
		   for (int i=0;i<3;i++) {
			   System.out.print(str[i]+" ");
		   }
		   //bubble sort
		   for (int i=0;i<3;i++) {
			   for (int j=0;j<3;j++) {
				   if (j+1 == 3) {
					   continue;
				   }
				  
					   
					   String temp;
					   temp = str[j];
					   str[j] = str[j+1];
					   str[j+1] =  temp;
				    } 
			   }
		   
		   for (int i=0;i<3;i++) {
			   System.out.println(str[i]);
		   }
	}

}
