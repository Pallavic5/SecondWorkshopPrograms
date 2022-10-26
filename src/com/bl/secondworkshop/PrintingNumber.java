package com.bl.secondworkshop;

public class PrintingNumber {

	public static void main(String[] args) {
		PrintingNumber obj = new PrintingNumber();
		obj.printNum();
		obj.printNum1();
	}

	private void printNum1() {
		int i = 1;
		while (i <= 10) {

			System.out.print(" " + i);

			i++;
		}

	}

	public void printNum() {
		int i = 10;
		do {
			System.out.print(" " + i);
			i--;
		} while (i >= 1);

	}

}
