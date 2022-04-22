package com.java.kaizen.string;

public class SmallAndcapital {
	
	public static void main(String[] args) {
		
	String str = "Pradeep";
	String sc = " ";
//	str = str.toLowerCase();
	str =str.toUpperCase();
	for (int i=0;i<str.length();i++)
	{
    	char ch  = str.charAt(i);
    	
    	 if(i%2==0) {
        	
   // 		 sc=sc+(char)(ch-32);
    		 sc= sc+(char)(ch+32);
			
		}
    	 else {
    		 sc=sc+ch;
    	 }
	} 
	System.out.println(sc);
  }
	
	}
   
	
	
	
