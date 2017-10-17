package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(20);
		set.add(10);
		
		for(int i : set) {
			System.out.println(i);
		}
		
		set.remove(40);
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(set.size());
	}

}
