package demo.com;

public class throwdemo {

	
	static void demoVote(int age) throws Exception
	
	{
	
		
		if(age<18) {
			
			
			 throw new Exception("You are not eligible for vote");
			
			
		}
		
		else {
			
			
			System.out.println("can vote");
			
	
		}
	
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		demoVote(12);

	}

}
