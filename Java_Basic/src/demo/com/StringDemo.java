package demo.com;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "hello";

		String str2 = "hello";

		String str3 = new String("world");
		String str4 = new String("world");

		if (str1 == str2) {

			System.out.println("matched");

		}

		if (str3 == str4) {

			System.out.println("matched");

		}

		else {

			System.out.println("not matched");

		}

		
		
		StringBuilder sb = new StringBuilder("Hello");
		StringBuffer sb1 = new StringBuffer("Kumar");
		
		sb1.append("Arya");
		
		

		sb.append("World");
		sb.append("this is new ");
		sb.append("test");

		System.out.println(sb.append(sb1));
		
		
		sb.insert(5, "new");
		
		
		System.out.println(sb);
		
		
		System.out.println(sb.reverse());
		

		System.out.println(sb.toString());
		
		
		
	}
	
	
	
	

}
