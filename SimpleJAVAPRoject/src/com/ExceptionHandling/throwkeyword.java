package com.ExceptionHandling;

public class throwkeyword {
	
	
	
	//throw keyword is used for custom exception
	
	
	
	static void ValidageforVote(int age) throws Exception {
		
		if(age>18) {
			
			
			System.out.println("Can cast a vote");
		}
		else {
			
			throw new AgeException("Age is less than 18");
			
			
		}
		
		}
		
	
//throws keyword is used in the method declaration to specify the execeptions a method may throw
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		ValidageforVote(17);

	}

}
