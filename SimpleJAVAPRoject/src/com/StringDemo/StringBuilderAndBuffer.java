package com.StringDemo;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str1 = new StringBuilder();
		
		StringBuffer str2 = new StringBuffer();
		
		
		
		str1.append("Hello");
		
		str1.append("World");
		
		
		System.out.println(str1);
		
		System.out.println(str1.charAt(0));
		
		System.out.println(str1.reverse());
		
		

		str2.append("New");
		
		str2.append("Object");
		
		
		System.out.println(str2);
		
		System.out.println(str2.charAt(0));
		
		System.out.println(str2.reverse());
		
		System.out.println(str2.toString());
		
		
		
		
		
		

	}

}
