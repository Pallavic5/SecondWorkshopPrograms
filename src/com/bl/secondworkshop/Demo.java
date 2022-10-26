package com.bl.secondworkshop;

public class Demo {

	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.speak();
		obj.show();
	}

}

abstract class Animal{
	abstract public void speak();
	public void show() {
		System.out.println("Show Message");
	}
}

class Dog extends Animal{

	@Override
	public void speak() {
	System.out.println("Dog is Barking!!");	
	}
	
}