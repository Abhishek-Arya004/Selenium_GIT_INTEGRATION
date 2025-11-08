package demo.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArryaListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		ArrayList<String> list3 = new ArrayList<String>();

		list3.add("Abhishek");
		list3.add("Rishabh");
		list3.add("Komal");

		Collections.sort(list3);

		System.out.println(list3);

		Collections.sort(list3, Collections.reverseOrder());

		System.out.println(list3);

		list3.toArray();

		System.out.println(list3.toString());

		list1.add(10);
		list1.add(20);
		list1.add(30);

		list2.add(40);
		list2.add(50);
		list2.add(60);

		System.out.println(list1);

		System.out.println(list2);

		list2.addAll(list1);

		System.out.println(list2);

		System.out.println(list2.contains(50));

		System.out.println(list2.isEmpty());

		System.out.println(list2.size());

		Collections.sort(list2);

		System.out.println(list2);
		
		
		System.out.println("+++++++++using iterator ++++++++++");

		Iterator it = list2.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		
		System.out.println("++++++++for loop+++++++++++");
		
		
		for(int i =0; i<=list2.size()-1; i++) {
			
			
			System.out.println(list2.get(i));
			
			
			
		}
		
		System.out.println("+++++++++for each++++++++++");
		
		
		
		for(Integer x : list2) {
			
			
			System.out.println(x);	
			
		}
		
		
		list2.set(2, 80);
		
		
		System.out.println(list2);
		
		list2.remove(2);
		
		
		System.out.println(list2);
		
		
		
		
		
		
		

	}

}
