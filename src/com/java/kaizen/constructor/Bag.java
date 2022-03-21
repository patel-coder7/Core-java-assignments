package com.java.kaizen.constructor;

public class Bag {

	String Brand;
	int Price;
	int  Size;
	int Weight;
	
	public Bag () {
		System.out.println("Non paramter");
	}
	public Bag (String Brand , int Price , int Size , int Weight)   {
		System.out.println("paramter");
		
		this.Brand = Brand;
		this.Price = Price;
		this.Size =  Size;
		this.Weight = Weight;
	
	}
	public static void main(String[] args) {
		Bag bag = new Bag();
		
		bag.Brand =" Wildcreft";
		bag.Price = 400;
		bag.Size = 24;
		bag.Weight = 1;
		
		bag.describeBag();
		}
	public void describeBag() {
		System.out.println("Bag [Brand=" + Brand + ", Price=" + Price + ", Size=" + Size + ", Weight=" + Weight + "]");
	}
}