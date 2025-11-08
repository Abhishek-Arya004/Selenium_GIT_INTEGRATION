package demo.com;

import java.util.ArrayList;
import java.util.List;

public class boxingUnboxingClass {
	
	//List<Integer> list =  new ArrayList<>();
	
	//list.add(10);//int ------>Integer
	
	
	//int 
	
	
	
	
	 int num = 10;
	
	
     Integer boxnum1 = num;//autoboxing
	
	
	Integer boxnum2 = Integer.valueOf(num); //boxing
	
	
	int num1 = boxnum2;//automunboxing;
	
	int num2 = boxnum2.intValue();//unboxing
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Integer> list =  new ArrayList<>();
		
		list.add(10);
		
		int num3 = list.get(0); //unboxing

	}

}
