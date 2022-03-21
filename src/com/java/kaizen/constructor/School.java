package com.java.kaizen.constructor;

public class School {
	String  name;
	String city;
	int Room;
	int Student;
	
	public School() {
		System.out.println("Non paramter");
		}
	public School (int Room ,int Student, String name , String city) {
		System.out.println("paramter");
		
		this.Room = Room;
	    this.Student = Student;
	    this.name = name;
	    this.city = city;
	    
	}
	public static void main(String[] args) {
		School school = new School();

		school.Room = 28;
		school.Student =  600;
		school.name = "A.S.Y.M";
		school.city = "Tigriya goga";
		
		school.describeSchool();
		
	}
	public void describeSchool() {
		System.out.println( "School [name=" + name + ", city=" + city + ", Room=" + Room + ", Student=" + Student + "]");
	}

}