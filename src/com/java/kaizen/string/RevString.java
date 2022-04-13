package com.java.kaizen.string;

public class RevString {
	public static void main(String[] args) {
		
		String str = "Kiazen";
//		String rev = "";
		char ch[] = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(i);
		//	rev = rev+str.charAt(i);
		}//System.out.println(rev);
	}

}
