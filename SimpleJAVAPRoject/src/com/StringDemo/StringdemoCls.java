package com.StringDemo;

public class StringdemoCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str_1 = "Hello";
		
		String str_2 = "Word";
		
		String str_4 ="";
		
		String str_5 = "HELLO";
		
		String str_6 = "    HELLO    ";
		
		String str_7 = "this is hello from my team";
		
		String str_8 = "ThIS IS HELLO";
		
		
		
		
		
		
		
		
		String str_3 = new String("Hello");
		
		System.out.println(str_1.length());
		
		System.out.println(str_1.charAt(2));
		
		System.out.println(str_1.indexOf('e'));
		
		System.out.println(str_4.isEmpty());
		
		System.out.println(str_1.equals(str_5));
		
		System.out.println(str_1.equalsIgnoreCase(str_5));
		
		System.out.println(str_1.concat(str_2));// new string --> Helloword
		
		System.out.println(str_1 + str_2);
		
		System.out.println(str_1.lastIndexOf("llo"));
		
		System.out.println(str_1.replace('e', 'a'));
		
		System.out.println(str_6);
		
		System.out.println(str_6.strip());
		
		System.out.println(str_7.toUpperCase());
		
		System.out.println(str_8.toLowerCase());
		
		System.out.println(str_6.trim());
		
		System.out.println(str_8.substring(2));
		
		System.out.println(str_8.contains("HELLO1"));
		
		char Allchar[] = str_8.toCharArray();
		
		
		for(int i =0 ; i <Allchar.length;i ++) {
			
			
			System.out.println(Allchar[i]);
			
			
			
		}
		
		String str_9 = new String(Allchar);
		
		
		System.out.println(str_9);
		
		
		
		
		// E A B --Different than a , b , c , d
		
		
		
		// 0  1   2  3  4
		// H  E   L   L  O

	}

}
