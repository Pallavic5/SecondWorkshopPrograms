package com.bl.secondworkshop;

public class DemoMethodOverLoading {

	public static void main(String[] args) {
		DemoNew demo = new DemoNew();
		System.out.println(demo.add(10, 20));
		System.out.println(DemoNew.add(2.0f,30.0f));

	}

}

class DemoNew{
	public int add(int a, int b) {
		return a + b;
	}
	
	public static float add(float x, float y) {
		return x + y;
	}
}
