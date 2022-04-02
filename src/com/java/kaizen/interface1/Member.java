package com.java.kaizen.interface1;

public class Member implements Singel,Milty {
	
	//override
	public void made() {
		System.out.println("eating");
	}
	public void Write() {
		System.out.println("later");
	}
	public void see() {
		System.out.println("dring");
	}
	
	public static void main(String []args) {
		
		Member m = new Member();
		m.made();
		m.Write();
		m.see();
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

}
