package com.bl.secondworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchListElement {

	public static void main(String[] args) {
		List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
		System.out.println(days);
		searchElement(days);
	}

	public static void searchElement(List<String> days) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().toLowerCase().charAt(0);
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < days.size(); i++) {
			String str = days.get(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.toLowerCase().charAt(j) == ch) {
					newList.add(days.get(i));

				}
			}

		}
		System.out.println(newList);
		// newList.stream().forEach(element -> System.out.println(element));

	}

}
