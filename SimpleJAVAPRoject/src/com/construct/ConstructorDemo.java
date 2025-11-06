package com.construct;

/*
 * Constructor---->
 
1. it is same like methods.                      
 
2. it can not be called | it is called when we create an object of class
 
3. it create/ construct the values of objects
 
4. it does not have any return type
 
5. it can be parameterize and non parameterize

6. multiple constrcutor with different parameters
 
 */

public class ConstructorDemo {

	int i = 10;

	String j = "hello";

	boolean k = true;

	void demo() {

		System.out.println("this is demo method");

	}

	ConstructorDemo() {

		System.out.println("this is constructor");

	}

	ConstructorDemo(int a, int b) {

		System.out.println(a + b);

	}
	
	ConstructorDemo(int a, int b ,int c) {

		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo obj = new ConstructorDemo();// constructor of the class
		
		
		ConstructorDemo obj1 = new ConstructorDemo(12, 13);
		
		
		obj.demo();

	}

}
