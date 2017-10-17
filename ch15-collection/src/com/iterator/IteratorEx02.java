package com.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx02 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");

		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String curStr = iterator.next();
			System.out.println(curStr);
			
			if(curStr.compareTo("Second") == 0) {
				iterator.remove();
			}
		}
		
		System.out.println();
//		iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
