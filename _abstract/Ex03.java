package _abstract;

import other.Animal;

class Cat extends Animal {
	
	Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(name + "ÀÌ°¡ ¾ß¿ë");
		
	}
}

class Dog extends Animal {
	
	Dog(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(name + "ÀÌ°¡ ¸Û¸Û");
	}
		
}

public class Ex03 {

	public static void main(String[] args) {
		
		Cat cat = new Cat("¶×ÀÌ");
		
		System.out.println(cat);
		cat.bark();
		
		Dog dog = new Dog("·°Å°");
		
		System.out.println(dog);
		dog.bark();
	}

}
