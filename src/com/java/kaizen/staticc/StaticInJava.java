package com.java.kaizen.staticc;

public class StaticInJava {

	int rollNo;
	String name;
	static String college = "LNCT";
	static int count = 0;
	
	static {
		System.out.println("In static block");
		System.exit(0);
	}
	
	StaticInJava(int rollNo,String block){
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
	public void show () {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(college);
	}
	
	public static void  print() {
		System.out.println("in print");
		System.out.println(college);
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		
		StaticInJava obj = new StaticInJava(101,"sumit");
		StaticInJava obj1 = new StaticInJava(102,"julee");
		
		obj.show();
		System.out.println("**********");
		StaticInJava.college = "orirntal";
		obj.show();System.out.println("****************");
		obj1.show();
		
		StaticInJava.print();
		
		double d = Math.pow(2, 2);
		System.out.println(d);
	}
}
