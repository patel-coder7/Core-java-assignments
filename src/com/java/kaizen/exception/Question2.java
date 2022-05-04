package com.java.kaizen.exception;

import java.io.FileOutputStream;

public class Question2 {
	
public static void main(String[] args) {
		
		try(FileOutputStream fos= new FileOutputStream(".//abc.txt")){
			String str= "hi Sumit";
			byte byteArr[] = str.getBytes();
			fos.write(byteArr);
			
			System.out.println("msg write success");
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		}


