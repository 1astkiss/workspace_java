package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
	}

}
