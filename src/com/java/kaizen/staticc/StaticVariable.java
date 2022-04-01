
package com.java.kaizen.staticc;

public class StaticVariable {

	int rollno;
	String name;
	
	//constructor
	StaticVariable(int rollno, String name){
		this.name = name;
		this.rollno = rollno;
		
	}
	public StaticVariable() {
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		StaticVariable sp = new StaticVariable();
		
		sp.name = "Sumit";
		sp.rollno = 05;
		sp.show();
		
	}
}
