package com.java.kaizen.exception;

public class Unchecked {
	
	public static void main(String args []) {
		
		try {
			int i = 10;
			int j = 0;
			
			System.out.println(i/j);
			
		}
//		catch(ArithmeticException Exception ){
//			System.out.println("in Arithmetic Exception");
//			
//			
//		}
		catch(Exception e ){
		System.out.println("please in the exception");
			e.printStackTrace();
			e.getSuppressed();
		}
		finally {
			System.out.println("this finally");
		}
		
		
	}
	
	
	

}
