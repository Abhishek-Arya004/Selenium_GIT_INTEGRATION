package Abstraction;

 abstract class Animal {
    public abstract void sound();
}

// Child class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: woof");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}


public class polymorphismexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;  // Declare variable of Parent class

        a = new Dog();  // Polymorphism
        a.sound();

        a = new Cat();  // Polymorphism
        a.sound();
	}

}
