package com.java.kaizen.string;

public class StringRevers {
	public static void main(String[] args) {

		String name = "Sumit patel";
		String rev=" ";

//		char ch[] = name.toCharArray();

		for (int i=name.length()-1;i>=0;i--) {
			rev=rev+ name.charAt(i);
//			System.out.println(i);
	
		}System.out.print(rev);
	}

}
