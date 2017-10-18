package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {

		String[] city = {"Seoul", "New York", "London", 
				"Paris", "Berlin", "Tokyo", "Hanoi"};
		
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i = 0; i < city.length; i++) {
			map.put(i, city[i]);
		}
		
		System.out.println(map);
		
//		Set<Integer> s = map.keySet();
//		System.out.println(map.keySet());
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			System.out.println(map.get(keys.next()));
		}
	}

}
