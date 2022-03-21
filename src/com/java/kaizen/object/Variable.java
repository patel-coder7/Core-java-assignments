package com.java.kaizen.object;

public class Variable {

	int i = 10;       //Intance variable
	 public void show () {
		 System.out.println(i);
		 i = 90;
		 
		 System.out.println(i);
		 int i = 89;      //loacl variable
		 System.out.println(i);
	 }
	 public void display () {
		 System.out.println(i);
		 
	 }
	 public static void main(String[] args) {
		Variable obj = new Variable();
		
		obj.show ();
		obj.display();
		
	}
	
}