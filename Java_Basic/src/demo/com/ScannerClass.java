package demo.com;

import java.util.Scanner;

// when we can to take input from the user at runtime
//java.util
//input--> keyboard|Files|Strings

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);// system.int--Repreasent standard input (keyboard)

		System.out.println("Enter your Name");

		String name = sc.nextLine();

		System.out.println("Enter your age");
		
		int age = 0;

		try {

			 age = sc.nextInt();

		}

		catch (Exception e) {

			System.out.println("input mis match");
		}
		
		finally {

		System.out.println("Enter your salary");
		
		Scanner sc1 = new Scanner(System.in);

		float salary = sc1.nextFloat();

		System.out.println(name + " " + age + "  " + salary);
		
		}

		sc.close();

	}

}
