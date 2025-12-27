package com.CollectionsDemo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<Integer> list1 = new ArrayList<Integer>();

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		for (int i = 0; i <= list1.size() - 1; i++) {

			System.out.println(list1.get(i));

		}
		
		Object array[] = list1.toArray();
		
		for (Object x : array) {

			System.out.println(x);

		}
		
		
		Iterator it = list1.iterator();
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());	
			
			
		}
		
		
		

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list2.add(11);
		
		
		System.out.println(list1);
		
		System.out.println(list2);
		
		
		System.out.println(list1.addAll(list2));
		

		System.out.println(list1.contains(3));

		System.out.println(list1.isEmpty());

		System.out.println(list1.indexOf(1));

		System.out.println(list1.size());

		System.out.println(list1.remove(4));

		System.out.println(list1.get(3));

		System.out.println(list1.set(2, 23));

		System.out.println(list1);

		System.out.println(list1.reversed());

		System.out.println(list1.toArray());

		

		

		// Primitive data type------->Wrapper----->Class object

		// Wrapper class objec-----Primitive

	}

}
