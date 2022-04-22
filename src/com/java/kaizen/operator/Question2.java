package com.java.kaizen.operator;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Loan Amount or enter 0 to exit");
			
			Double LoanAmount = sc.nextDouble();
			if (LoanAmount ==0 ) {
				break;
			}
			System.out.println("Enter Interest % ");
			
			Double interest  = sc.nextDouble();
			System.out.println("Enter Duration(in months) ");
			int Duration = sc.nextInt();
			System.out.println("you interest is: "+ ((LoanAmount*interest*Duration)/100));
			
		}
	}

}
