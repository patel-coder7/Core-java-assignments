package com.java.kaizen.staticc;

public class StaticVar {

	int id;
	static String name = "Sumit";
	
	//constructor
	public StaticVar() {
		this.id = id;
		}
	public void show () {
		System.out.println(id);
		System.out.println(name);
		
	}
	public static void main(String []args) {
		
		StaticVar obj = new StaticVar();
		
		obj.id = 1;
		obj.show();
		obj.name = "Sumit";
	}
}
