package com.java.kaizen.accessmodifiers;

public class Telecon extends Forest{
	
	public void see() {
		super.made();
		super.some();
		super.sum();
		
	}
	public static void main(String[] args) {
		Telecon t = new Telecon();
		t.see();
	}

}
