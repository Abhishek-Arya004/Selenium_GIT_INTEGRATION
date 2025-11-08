package Abstraction;

public class Useabstarct extends Demoabstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useabstarct obj1 = new Useabstarct();
		obj1.demo();
		obj1.display();

	}
	
	//overriden
    void display() {
    	System.out.println("display method");
    }
}
