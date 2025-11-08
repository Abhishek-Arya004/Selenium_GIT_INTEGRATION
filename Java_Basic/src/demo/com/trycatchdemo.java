package demo.com;

public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;

		// int c = i/0;//

		String str = null;

		String str2 = "hello";

		// System.out.println(str.length());

		try {

			// System.out.println(str2.charAt(5));

			int c = i / 0;

		}

		

		catch (Exception e) {
			System.out.println("there is an excepion" + e);

		}
		
		finally {
			
			
			System.out.println("this will always run");
			
		}

		System.out.println("hello to test this");

	}

}
