package com.java.kaizen.object;

public class Person {
	
	String name;
	int age;
	String city;
	String gender;
	
	public Person() {
		System.out.println("testing");
		
	}
	public Person(String name, int age ,String city ,String gender) {
		System.out.println("testing2");
		name = name;
		this.age =age;
		this.city =city;
		this.gender = gender;
	}
	
	
	

	public static void main(String[] args) {
	Person person = new Person();
	person.describepreson();
	
	person.name = "Dessy";
	person.age = 20;
	person.city ="pune";
	person.gender = "female";
	
	Person jonh = new Person("jonh", 35, "Delhi","male");
	jonh.describepreson();
	
	
	}
	public void eat() {
		System.out.println("Eating");
			
		}
	
	public void play () {
		System.out.println("playing");
		
	}
	public void sleep() {
		System.out.println("sleeping");
		
	}
	public void study () {
		System.out.println("studing");
	}
	public void describepreson () {
		System.out.println("person [name="+name+",age="+age+",city="+ city +", gender=" + gender +"]");
		
		
	}
	
	}

