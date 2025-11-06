package com.OPPS;

public class InterfaceClass implements inter1 ,inter2 {
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InterfaceClass obj = new InterfaceClass();
		
		obj.demo1();
		obj.demo2();
		obj.demo3();
		
		System.out.println(obj.var_1);
		
		System.out.println(obj.var_2);

	}

	public void demo2() {
		// TODO Auto-generated method stub
		
		System.out.println("demo2");
		
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		
		System.out.println("demo1");
	}

	@Override
	public void demo3() {
		// TODO Auto-generated method stub
		
		
		System.out.println("demo3");
		
	}

}
