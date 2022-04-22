package com.java.kaizen.string;

public class PalindromeString {
	public static void main(String[] args) {
		String r = "deed";
		String rev = "";
		
		char ch[] = r.toCharArray();
		System.out.println(r);
		
		for (int i=r.length()-1;i>=0;i--) {
			rev=rev+r.charAt(i);
		}System.out.println(rev);
		
		}

}
