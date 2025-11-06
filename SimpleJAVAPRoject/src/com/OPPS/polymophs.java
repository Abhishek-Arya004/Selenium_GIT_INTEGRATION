package com.OPPS;

public class polymophs extends demopol{
	
	//compile time poly morphisam

	public void add(int a, int b) {  

		System.out.println("this addition" + (a + b));

	}

	void add(int a, int b, int c) {

		System.out.println("this addition" + a + b +c);

	}

	void add(int a, int b, int c, int d) {

		System.out.println("this addition" + a + b + c + d);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		polymophs obj = new polymophs();
		
		
		demopol obj1 = new polymophs();// run time polymorphism
		
		obj1.add(12, 13);
		
		
		obj.add(12, 13);
		
		
		
		
		
		
		
	}

}
