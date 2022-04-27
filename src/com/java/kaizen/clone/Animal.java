package com.java.kaizen.clone;

public class Animal implements Cloneable {
	
	int id;
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		try {
			
			Animal al = new Animal();
			al.id = 01;
			al.name =" Dog";
			al.age = 12;
			
			System.out.println(al.id);
			System.out.println(al.name);
			System.out.println(al.age);
			
			Animal al2 = (Animal) al.clone();
			System.out.println(al2);
			
	//		System.out.println(al.toString());
		}
		catch(Exception c) {
			System.out.println(c);
		}
	}

	
	}


