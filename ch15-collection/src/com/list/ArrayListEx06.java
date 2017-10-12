package com.list;

import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(new Integer(10));
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		for(Integer num : al) {
			System.out.println(num.intValue());
			System.out.println(num);
		}
	}

}
