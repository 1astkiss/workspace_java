package com.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetEx02 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			int num = (int)(Math.random() * 45) + 1;
			System.out.println(set.add(new Integer(num)));
		}
		
		System.out.println(set);
		LinkedList<Integer> list = new LinkedList<Integer>(set);
		LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>(set);
		Collections.sort(list);
//		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		
	}

}
