
//if you make method static than you can call it inside main without class object and
// call directly
//it can not used with super and this keyword


package com.keyword;

public class staticdemo {
	
	
	int i = 20; //instance variable
	
	int j = 30;
			
   static  int k = 50; // static variable	--class	
	
	static void dis() {
		
		System.out.println("Demo for display");
	}

	public static void main(String[] args) {// class area
		// TODO Auto-generated method stub
		
		int l = 60;//local variable
		
		
		k= 50;// static variable is accessible
		
		staticdemo obj1 = new staticdemo();

		
		obj1.i = 40;
		obj1.j = 50;
		
		dis();
		
		
	outerclass.innerClass inner  = new outerclass.innerClass();
	
	
	inner.display();
		
		
		
	}

}
