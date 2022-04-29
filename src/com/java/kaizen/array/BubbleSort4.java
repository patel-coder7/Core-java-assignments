package com.java.kaizen.array;

import java.util.Scanner;

public class BubbleSort4 {

	public static void main(String[] args) {
		
		char[] ch = new char[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<5;i++) {
			System.out.println("enter the value");
			ch[i] = sc.next().charAt(0);
		}
		System.out.println("After Bubble sort");
		for (int i=0;i<5;i++) {
			System.out.print(ch[i]+" ");
		}
          for(int i =0 ;i<5;i++) {
		       for (int j=0;j<5;j++) {
		    	   if (j+1 == 5) {
		    		   continue;
		    	   }
		    	   if (ch[j]> ch[j+1]){
		    		   
		    		   int temp;
		    		   temp = ch[j];
		    		   ch[j] = ch[j+1];
		    		   ch[j+1] = (char) temp;
		    	   }
		       }
		       }
          for(int i=0;i<5;i++) {
        	  System.out.println(ch[i]);
          }
	}
}
