package com.CollectionsDemo;


// Primitive data types to wrapper class objects

//int----------->Integer --->Object-----Autoboxing
//char---------->Character
//float--------->Float
//boolean------->Boolean

//Boolean------->boolean--->unboxing

public class WrapperClass {
	
	
	int i = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int j = 20;
		
		
		Integer c = j;
		
		System.out.println(j);
		
		System.out.println(c);
		
		
		int k = c;
		
		System.out.println(k);

	}

}
