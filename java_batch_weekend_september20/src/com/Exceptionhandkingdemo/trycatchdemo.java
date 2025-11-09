package com.Exceptionhandkingdemo;

public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 0;
		
		try {
		//int c = i/j;
			String str = null;
			System.out.println(str.length());
		}
		
		catch(NullPointerException e) {
			System.out.println("Exception occur but  handle" + e);
		}
		
		finally {
		System.out.println("this is finally block")	;
	
		System.out.println("this next line of code 1");
	
		System.out.println("this next line of code 2");
	}
}
}