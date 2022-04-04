package com.java.kaizen.accessmodifiers2;


import java.util.Scanner;

import com.java.kaizen.aggragation.Operation;

public class Toys {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Operation p = new Operation();
		p.square(43);
		System.out.println(p.square(43));
		
	}
}
