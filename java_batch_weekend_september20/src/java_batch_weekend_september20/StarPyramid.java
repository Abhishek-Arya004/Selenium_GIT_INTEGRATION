package java_batch_weekend_september20;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows = 7;
        for(int row =1; row<= rows; row++) {
        	for(int space =1; space <=rows-row; space++) {
        		System.out.print (" ");
        	}
        
        for(int star =1; star <= row; star++) 
        {
        	System.out.print("* ");
        }
        System.out.println();
        }
       }
        
	}
 


