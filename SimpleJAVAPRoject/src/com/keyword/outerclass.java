package com.keyword;

public class outerclass {

	static int outerdata = 100;

	static class innerClass {

		void display() {

			System.out.println("Accessing static data of outetclass" + outerdata);

		}

	}

}
