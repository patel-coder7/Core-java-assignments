package com.java.kaizen.object;

public class Animals {
	
	String name;
	String colour;
	String eat;
	int age;
	
	public Animals() {
		System.out.println("Non parameter");
		
	}
      public Animals(String name,String colour , String eat , int age) {
    	  System.out.println("parameter");
    	  this.age = age;
    	  this.colour = colour;
    	  this.eat = eat;
    	  this.name = name;
    	   }
      public static void main(String[] args) {
		
    	  Animals an = new Animals();
    	  an.age = 2;
    	  an.colour = "Blue";
    	  an.eat = "food";
    	  an.name = "Pappy";
    	  an.describeanimals();
    	  	}
      
      public void  describeanimals() {
    	  System.out.println("Animal[name "+name+", age="+age+ ", colour="+colour+", eat="+eat+"]");
      }
}
