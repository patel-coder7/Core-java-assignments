package com.java.kaizen.collections;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s = new Stack<Integer>();
		
       System.out.println(s);
       
       s.push(20);
       System.out.println("push-->"+s);
       s.push(30);
       System.out.println("push-->"+s);
       s.push(54);
       System.out.println("push-->"+s);
       
      System.out.println(s);
       
       s.pop();
       System.out.println("pop-->"+s);
       
       System.out.println(s.size());
       
       boolean b = s.isEmpty();
       System.out.println(s);
       System.out.println(b);

	}

}
