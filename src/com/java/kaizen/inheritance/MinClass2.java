package com.java.kaizen.inheritance;

public class MinClass2 {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.age();
		em.name();
		em.Work();
		
		Manager m = new Manager();
		m.post();
		m.lrean();
		
		Secretary se = new Secretary();
		se.Duty();
		se.eat();
	}
}
