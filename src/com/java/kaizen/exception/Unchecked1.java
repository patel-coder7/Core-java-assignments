	package com.java.kaizen.exception;

public class Unchecked1 {
	public static void main(String[] args) {
		
		try {
		int i= 10;
			int j = 0;
			String str = null;
			int arg [] = new int [4];
		//	arg[4]= 5;
			System.out.println(str.length()); 
				
		System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("the ArithmeticException | NullPointerException e");
			e.printStackTrace();
		}
//		catch(NullPointerException e) {
//			System.out.println("the NullPointer");
//			e.printStackTrace();
//		}
		catch(Exception e) {
			System.out.println("the");
			e.printStackTrace();
		}
		finally {
			System.out.println("the fanilly");
		}
	}

}
