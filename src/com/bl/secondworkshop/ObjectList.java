package com.bl.secondworkshop;

import java.util.ArrayList;
import java.util.List;

public class ObjectList {

	public static void main(String[] args) {
		List<Character> obj = new ArrayList<>();
		obj.add('a');
		obj.add('0');
		obj.add('b');
		obj.add('c');
		obj.add('d');
		obj.add('0');
		obj.add('0');
		obj.add('e');
		obj.add('f');
		obj.add('g');
		obj.add('0');
		obj.add('h');
		System.out.println(obj);
		
		ObjectList list = new ObjectList();
		list.removeZero(obj);

	}
	
	public void removeZero(List<Character> list) {
		Character ch = '0';
		for(int i = 0; i < list.size(); i++) {
			list.remove(ch);
		}
		System.out.println(list);
	}

}
