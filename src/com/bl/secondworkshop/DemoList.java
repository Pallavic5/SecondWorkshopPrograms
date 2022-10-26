package com.bl.secondworkshop;

import java.util.Arrays;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("Mumbai", "Pune", "Delhi", "Chennai");
		DemoList demo = new DemoList();
		demo.countVowels(city);

	}

	public void countVowels(List<String> strVowels) {
		int numCount = 0;
		for (String s : strVowels) {
			numCount += vowelsString(s);
		}
		System.out.println(numCount);
	}

	public int vowelsString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}

		return count;
	}

}
