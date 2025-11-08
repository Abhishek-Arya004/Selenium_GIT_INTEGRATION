package Inheritance;

public class Multilevelinheritance3 extends MultilevelInheritance2 {

	void DemoC() {
		System.out.println("print demoC");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multilevelinheritance obj1 = new  Multilevelinheritance();
		//MultilevelInheritance2 obj2 = new MultilevelInheritance2();
		 Multilevelinheritance3 obj3 = new Multilevelinheritance3();
		 obj3.DemoA();
		 obj3.DemoB();
		 obj3.DemoC();
	}

}
