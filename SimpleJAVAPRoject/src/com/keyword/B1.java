/*

4. Keywords: super, static, this, final 

Final
------

1. before variable : you can not change the value of variable
2. final method: you can not override this method
3. before class : you can  not make that class Parent 

Super
-----

Work like immediate parent class object

1. use to call parent class methods
2. use to access parent class variable
3. use to call parent class constructor


A1----Parent class
B1----Child class

This keyword
--------------

Similar like Reference Variable that refers to the current object of the class

obj.i | this.i

obj.demo() | this.demo();

A1() | this()

void( A1 obj){} | void(this)

same variable name in local variable and instance variable so can use to distinguish 


*/

package com.keyword;

public class B1 extends A1 {

	int i = 10;

	int j = 20;

	void demo() {

		System.out.println("this is test message");

	}

	void access() {

		System.out.println("Parent class Variable:" + k);
		add(12, 14);

	}
	
	
	B1(int i , int j){
		
		System.out.println("Parameterize" + (i + j));
		
	}

	B1() {

		// Super();//don't need to put as it is used autatically to call parent class
		// constructor
		
      //  this (12,13);
		
		///System.out.println("Default constructor");
	}

	B1 demothis(int i, int j) {

		this.i = i;
		this.j = j;
		
		//System.out.println(this.i);
	//	System.out.println(this.j);
		
	//	this.demo();//calling current class method
		
		return this;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 obj = new B1();
		
		System.out.println(obj);

		System.out.println(obj.demothis(12, 13));

		// obj.i = 30;

		// obj.j = 40; can not change the value because j is final variable

		// obj.k = 20;

		// obj.demo();

		// obj.access();

	}

}
