package com.java.kaizen.accessmodifiers2;

import java.util.Scanner;

import com.java.kaizen.accessmodifiers.Forest;
import com.java.kaizen.accessmodifiers.Home;

public class FormatPackage {
	
	public static void main(String[] args) {
		
		Scanner sb =  new Scanner(System.in);
		
		Home h = new Home();
		h.display();
		
		Forest f = new Forest();
		f.made();
		
	}

}
