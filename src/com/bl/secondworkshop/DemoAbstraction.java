package com.bl.secondworkshop;

public class DemoAbstraction {

	public static void main(String[] args) {
		MainDemo obj = new MainDemo();
		obj.show();
	}

}

abstract class Demo1 {
	abstract public void show();
}

class MainDemo extends Demo1 {

	@Override
	public void show() {
		System.out.println("Its a abstract method");

	}

}