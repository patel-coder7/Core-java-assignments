package com.java.kaizen.clone;

public class Student implements Cloneable  {

	int id;
	int age;
	String name;	
	
	@Override
	public String toString() {
		
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}



	public static void main(String[] args) {
	try {
		Student s1 = new Student();
		 s1.id= 14;
		 s1.name = "Sumit";
		 s1.age = 21;
		 System.out.println(s1.age);
		 System.out.println(s1.id);
		 System.out.println(s1.name);
		 
		 Cloneable s2 = (Cloneable) s1.clone();
		 
//		 System.out.println(s2.toString());
		 
		 System.out.println(s2);
		 
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}
}
