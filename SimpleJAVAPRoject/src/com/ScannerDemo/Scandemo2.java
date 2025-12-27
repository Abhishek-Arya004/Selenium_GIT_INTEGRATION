package com.ScannerDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scandemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//when we need an input ot data from user while executing the code
		
		// take out money from you account--->ATM
		//running---->stopped your input--wait-
		
		//keyboard or mouse// touch
		
		
		// Card----Chip----Valid---->Visa----Network(mastercard,rupay,Amx)--->Internet--database
		//machin---card---verify---valid or not---->saving or current--->Ampout--->5000
		
		//password---->(backend) balace---->account-------->Precess--->Machin
		//---message---->your account is not suffient
		
		File file = new File("test.txt");// will create file on inside this project
		
		//FileWriter writer = new FileWriter(file);
		
		//writer.append("this is arya");
		//writer.append("from noida");
		
		
		//writer.close();
		
	//	Scanner obj = new Scanner(System.in);//java.util
		
		Scanner obj = new Scanner(file);//java.util
		
		
      //  System.out.println("pls enter yourname");	
        
        String data =obj.nextLine();
        
        
        System.out.println(data);	
        

//        System.out.println("pls enter age");	
//        
//        int age =obj.nextInt();
//        
//        
//        
// System.out.println("pls enter salary");	
//        
//        double Salary = obj.nextDouble();
//        
//        
//        System.out.println("NAME: " +name + "  " + "Age:  " +name + " " +"Salary: " + Salary);

	}
	
	//login/username and password--------> mobile otp--wait--->enter---->logi

}
