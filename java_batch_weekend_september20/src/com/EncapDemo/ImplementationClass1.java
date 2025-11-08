package com.EncapDemo;

public class ImplementationClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AccessClass obj = new AccessClass();
   System.out.println("Name: " + obj.getName());
   System.out.println("Age: " + obj.getAge());
   System.out.println("Salary: " + obj.getsalary());
   
   obj.setName("Rakhi");
   obj.setAge(46);
   obj.setsalary(600000);
   
   System.out.println("\nAfter updating:");
   System.out.println("Name: " + obj.getName());
   System.out.println("Age: " + obj.getAge());
   System.out.println("Salary: " + obj.getsalary());
	}

}
