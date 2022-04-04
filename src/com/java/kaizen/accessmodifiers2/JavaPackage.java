package com.java.kaizen.accessmodifiers2;

import java.util.Scanner;

import com.java.kaizen.inheritance.*;

public class JavaPackage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		a.eat();
		Books b = new Books();
		b.price();
		
	}
}