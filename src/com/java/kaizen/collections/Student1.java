package com.java.kaizen.collections;

import java.util.List;

import com.java.kaizen.methodoveriding.Student;

public class Student1 implements Comparable<Student1> {
	
	int rollno;
	String name;
	String college;
	
	public Student1(int rollno , String name, String college) {
		
		this.rollno = rollno;
		this.name = name;
		this.college = college;
			
	}
	
	public String toString() {
		
		return "Student[rollno="+rollno+",name="+name+",college="+college+"]";
	}

	@Override
	public int compareTo(Student1 o) {
		
		return this.rollno-o.rollno;
	}
}


