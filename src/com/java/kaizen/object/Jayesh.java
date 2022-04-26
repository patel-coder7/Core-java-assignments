package com.java.kaizen.object;

public class Jayesh {
	
	String name;
	int  Age;
	String city;
	
	public  Jayesh (){
		System.out.println("Non parameter");
	}
	
	public Jayesh(String name, String city , int Age) {
		System.out.println("Parameter");
		this.Age= Age;
		this.city =city;
		this.name = name;
	}

	public static void main(String[] args) {
		Jayesh js = new Jayesh();
		js.Age= 10;
		js.city = "Dewas";
		js.name = "Patel";
		js.describePatel();
		
		Jayesh Patel = new Jayesh("Patel" , "Dewas", 10);
		Patel.describePatel();
		
	}
	public void describePatel() {
		System.out.println("Patel[name= "+name+", Age= "+Age+" , city="+city+"]");
	}

}
