package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx03 {

	public static void main(String[] args) {

		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i < 10; i++) {
			original.add(i + "");
		}
		
		Iterator iterator = original.iterator();
		
		//copy
		while(iterator.hasNext()) {
			copy1.add(iterator.next());
		}
		
		System.out.println("original에서 Copy1으로 복사(copy) >>>");
		System.out.println("original : " + original);
		System.out.println("copy1 : " + copy1);
		
		
		// move
		iterator = original.iterator();
		while(iterator.hasNext()) {
			copy2.add(iterator.next());
			iterator.remove();
			
		}
		
		System.out.println("original에서 Copy1으로 이동(move) >>>");
		System.out.println("original : " + original);
		System.out.println("copy2 : " + copy2);
		
	}

}
