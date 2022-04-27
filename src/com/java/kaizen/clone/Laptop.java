package com.java.kaizen.clone;

public class Laptop implements Cloneable{
	
	String name;
	String Brand;
	
	Laptop(){
		System.out.println("String name ,String Brand");
	}
	public static void main(String[] args) throws Exception {
		
		Laptop  lp = new Laptop();
		lp.name =" Dell";
		lp.Brand =" Delling";
		
		System.out.println(lp.name);
		System.out.println(lp.Brand);
		
		Laptop lp1 = (Laptop) lp.clone();
		System.out.println(lp);
		
		
		
	}

}
