package com.bl.secondworkshop;

public class OverridingExample {

	public static void main(String[] args) {
		Main main = new Main();
		main.show();

	}

}

class DemoMain {
	public void show() {
		System.out.println("It's a first method");
	}

}

class Main extends DemoMain {

	@Override
	public void show() {
		super.show();
		System.out.println("It's a second method");
	}
}
