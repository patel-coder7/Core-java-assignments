package com.java.kaizen.abstraction;

public class DriverClass {
	

	public static DriverClass getInstance() {
		return new DriverClass();
	}
	
	
	public static void main(String[] args) {
		PolicyBaazar obj ;
//		obj = new Icic();
		obj = new SBI();
		obj.getRateOfInterest();
		
		DriverClass obj1 = DriverClass.getInstance();
	}


}
