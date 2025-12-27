package com.CollectionsDemo;

import java.util.HashSet;

public class SetDFemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet <Character> hs = new HashSet<Character>();//unordered list

		
		
		hs.add('e');
		hs.add('b');
		hs.add('c');
		hs.add('d');
		
		
		System.out.println(hs);
		
		System.out.println(hs.contains('d'));
		
		System.out.println(hs);
	}

}
