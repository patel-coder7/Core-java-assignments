package com.java.kaizen.constructor;

public class Bus {

	String Name;
	String Brand;
	String colour;
	int Time;
	int pasn;

	public Bus() {
		System.out.println("Non paramter");
	}

	public Bus(String Name, String Brand, String colour, int Time, int pasn) {
		System.out.println("paramter");

		this.Name = Name;
		this.Brand = Brand;
		this.colour = colour;
		this.Time = Time;
		this.pasn = pasn;
	}

	public static void main(String[] args) {
		Bus Tata = new Bus();
			Tata.Name = "ibus";
			Tata.Brand = "Tata";
			Tata.colour = "Blue";
			Tata.Time  = 7;
			Tata.pasn = 11;
			Tata.describeBus();
	}

	public void describeBus() {
		System.out.println(
				"Bus [name=" + Name + ", Brand=" + Brand + ", colour=" + colour + ", Time=" + Time + ", pasn=" + pasn);
	}
}
