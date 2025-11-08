package Constructor;

public class ConstructorDemo {
	int i =10;
	String j= "hello";
	boolean k = true;
	
	void demo() {
		System.out.println("this is demo method");
	}
	ConstructorDemo(){
		
		System.out.println("this is demo Constructor");
	}
ConstructorDemo(int a, int b){
		
		System.out.println(a+b );
	}
	
ConstructorDemo(int a, int b, int c){
	
	System.out.println(a+b+c);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(15,20);
		obj.demo();

	}

}
