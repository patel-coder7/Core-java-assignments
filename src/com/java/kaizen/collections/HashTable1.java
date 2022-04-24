package com.java.kaizen.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
	
	public static void main(String[] args) {
		
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	
     ht.put(102, "Shiva");
     ht.put(202, "Raje");
     ht.put(303, "Baba");
     ht.put(404, "hansh");
//     ht.put(505, null);
     System.out.println(ht);
     
     
    for (Map.Entry mp : ht.entrySet()) {
   	System.out.println(mp.getKey());
    	System.out.println(mp.getValue());
    }

    
	}

}
