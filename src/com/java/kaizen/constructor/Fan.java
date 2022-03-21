package com.java.kaizen.constructor;

public class Fan {

	String name;
	int price;
	int warranty;
	
	public Fan () {
		System.out.println("Non paramter");
		
	}
	public Fan (int price,int warranty,String name) {
		System.out.println("paramter");
		this.name =name;
		this.price =price;
		this.warranty = warranty;
		}
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.name =" usa";
		fan.price = 1500;
		fan.warranty = 6;
		
		fan.describeFan();
		Fan morel = new Fan(2000,8,"morel");
		fan.describeFan();
	}
	public void describeFan() {
		System.out.println("Fan [name=" + name + ", price=" + price + ", warranty=" + warranty + "]");
	}
	
}