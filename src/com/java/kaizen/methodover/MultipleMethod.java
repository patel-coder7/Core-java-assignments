package com.java.kaizen.methodover;

public class MultipleMethod {
	
	public void multiple(int i,int j) {
		System.out.println(i*j);
	}
	public void Multiple(int j,float f) {
		System.out.println(j*f);
	}
	
	public void Multiple(long k,float f,int i) {
		System.out.println(k*f*i);
		
	}
	public void Multiple(byte b, long l, float f) {
		System.out.println(b*l*f);
	}
	public static void main(String[] args) {
		MultipleMethod op = new MultipleMethod();
		op.Multiple (10,20);
		op.Multiple(21, 12.03f);
		op.Multiple(4,14.3f,4);
		op.Multiple(4,8);
	}

}
