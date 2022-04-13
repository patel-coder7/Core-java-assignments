package com.java.kaizen.encapsulation;

import java.util.Scanner;

public class Encapsulation1 {
	
	private int mobileno;
	private int Account;
	
	Scanner in = new Scanner(System.in);
	
	public void setmobileno(int mobileno) {
		
		System.out.println("hiiii");
		mobileno = in.nextInt();
		this.mobileno = mobileno;
		
	}
	public void setAccountno(int Accountno) {
	  Account = Accountno;
	}
	public int getAccountno() {
		return Account;
	}
	public int getmobileno() {
		return mobileno;
	}
	
	

}
