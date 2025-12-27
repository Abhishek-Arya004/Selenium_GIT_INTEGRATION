package com.CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap <Integer, String> hm = new HashMap<>();
		
		
		hm.put(1, "Ram");
		
		hm.put(2, "Shayam");
		
		hm.put(3, "Rohan");
		
		hm.put(4,"sohan");
		
		
		System.out.println(hm);
		
		
		System.out.println(hm.get(3));
		
		System.out.println(hm.keySet());
		
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.remove(4));
		
		System.out.println(hm);
		
		
		for(Integer x : hm.keySet()){
			
			System.out.println(x + "=" + hm.get(x));	
			
			
		}
		

	}

}
