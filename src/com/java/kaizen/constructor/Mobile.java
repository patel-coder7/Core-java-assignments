package com.java.kaizen.constructor;

public class Mobile {

	String name;
	String model;
	int price;
	
	public Mobile() {
		System.out.println("Non paramter");
	}
	public Mobile (int price, String name , String model) {
		System.out.println("paramter");
		this.name = name;
		this.price = price;
		this.model = model;
		
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.model =" vivo1909";
		mobile.name = "vivoy73";
		mobile.price = 21000;
		
		mobile.describeMobile();
		Mobile oppo = new Mobile (1200,"oppok13","oppo1909");
		oppo.describeMobile();
		
		}
	public void describeMobile() {
	System.out.println("Mobile [name=" + name + ", model=" + model + ", price=" + price + "]");
			}

}