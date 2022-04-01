package com.java.kaizen.inheritance;

public class MinClass {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}
}
