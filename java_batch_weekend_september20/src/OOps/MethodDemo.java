package OOps;

public class MethodDemo {
         int i =20; int j=10;
    public void addition() {
		System.out.println("Addition: " + (i+j));
		}
	
	public int subtraction(int i, int j){
		System.out.println("subtraction: " + (i-j));
		
		return i-j;
		
	}
	
	static void division(int i, int j) {
		System.out.println("division: " + (i/j));
		
		}
	

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo obj= new MethodDemo();
		obj.addition();
		obj.subtraction(30, 10);
		division(20,5);
		
		}
	    
	}


