package com.java.kaizen.interface1;

public class IDFC implements InterFaceB,InterFaceC {
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Amit");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Sumit");
	}
	

	public static void main (String []args) {
		
		
		InterFaceC t = new IDFC();
		t.display();
		
	}

	

	
	
	


}
