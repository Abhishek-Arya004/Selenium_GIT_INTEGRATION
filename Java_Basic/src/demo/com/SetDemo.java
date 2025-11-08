package demo.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(30);
		list1.add(null);
		list1.add(null);
		
		

		
		
		
		System.out.println(list1);
		
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
	    set.add(30);
	    set.add(30);
	    set.add(null);
	    set.add(null);
	    
	    
	    
	    System.out.println(set);
	    
	    
	    
	    
	    
	   
		
		

	}

}
