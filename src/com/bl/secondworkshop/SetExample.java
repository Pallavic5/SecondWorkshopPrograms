package com.bl.secondworkshop;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		set.add(105);
		set.add(105);
		set.add(103);
		System.out.println(set);

	}

}
