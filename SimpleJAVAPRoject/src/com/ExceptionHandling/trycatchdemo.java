package com.ExceptionHandling;

public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;

		int j = 0;
		
		
		try {

		//int c = i / j; // infinity
		
		String str = null;
		
		System.out.println(str.length());
		
		}
		

		catch(Exception i1) {
			
			System.out.println("Exception occurred but is handled   " + i1);
			
		}
		
		finally {/// this will always executed 
		
		
	     System.out.println("this is finally block");
			

		System.out.println("this next line of code-1");
		

		System.out.println("this next line of code-2");
		
		
		}
		

	}

}
