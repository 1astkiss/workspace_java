package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {

		HashSet<String> hs01 = new HashSet<>();
		HashSet<String> hs02 = new HashSet<>();

		hs01.add("red");
		hs01.add("yellow");
		
		System.out.println(hs01.add("blue"));
		System.out.println(hs01.add("blue"));
		
		for(String str : hs01){
			System.out.println(str);
		}
		
		hs02.add("blue");
		hs02.add("red");
		hs02.add("yellow");
		
		Iterator<String> iterator = hs02.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("size of hashset : " + hs02.size());
		
	}

}
