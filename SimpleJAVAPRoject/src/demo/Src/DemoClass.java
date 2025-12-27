package demo.Src;

public class DemoClass {
	
	
	int l = 30;//instance variable
	
	static int m = 40;//memory---common type data---class area
	
//	java types ?
			
	
	//local
	//instance
	//static
			
	
	
	int demo() {
		
		
		
		return 0;
	}

	
	//System.out.println();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 20;
				
	    int i_1 = 30;	
	    
	  //  int i-1 = 20;
	    
	    int _i = 30;
	    
	    int i1 = 30;
	    
	    int $i = 30;//local
	    
	    int a = 20;
	    
	    int b = 40;
		
		
		System.out.println(" this is : " +  (7+9));
		
		System.out.println( (a > b ? 1 : 2));
		
		
		
		DemoClass obj1 = new DemoClass();
		
		DemoClass obj2 = new DemoClass();
		
		int k = 20;
		
		int i3 =  new DemoClass().demo();
		
		
		
		System.out.println(obj1.l);
		
		obj1.l = 400;
		
		System.out.println(m);
		
		System.out.println(obj2.l);
		
		System.out.println(obj1.l);
		
		System.out.println(obj2.l);
		

	}

}
