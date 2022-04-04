package com.java.kaizen.accessmodifiers;

public class Window extends  Home{
	
	public void show () {
		super.show();
		super.display();
		super.some();
	}
	public static void main(String[] args) {
		
	Window w = new Window();
	w.display();
	w.show();
    w.some();
    
	}

}

