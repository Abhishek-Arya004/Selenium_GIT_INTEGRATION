package com.Exceptionhandkingdemo;

public class Throwkeyword {
	
	//throw keyword is used for custom exception
	
	
	
     static void ValidageforVote(int age) throws Exception {
	  
    	 if(age>18) {
		  System.out.println("can cast a vote");
	  } 
    	 else {
		  throw new Exception("age is less than 18");
	  
	  }
     }
  
//throws keyword is used in the method declartion to specify the execption a method may handle
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ValidageforVote(17);

	}

}
