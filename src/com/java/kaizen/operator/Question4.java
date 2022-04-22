package com.java.kaizen.operator;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enteryour name");
		String name = in.next();
		
		System.out.println("Enter your lastnae");
		String lastname = in.next();
		
		System.out.println("Enter youe age");
		int age = in.nextInt();
		
		System.out.println("Enter your adsress");
		String address = in.next();
		
		
		System.out.println("Name :"+ name + lastname);
		System.out.println("age :" + age);
		System.out.println("address :" + address);
	}

}
