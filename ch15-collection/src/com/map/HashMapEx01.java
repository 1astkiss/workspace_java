package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("삼십", 30);
		hashmap.put("십", 10);
		hashmap.put("오십", 50);
		hashmap.put("사십", 40);
		hashmap.put("이십", 20);
		
		System.out.println(hashmap.keySet());
		
		for(String key : hashmap.keySet()) {
			System.out.println(key + " : " + hashmap.get(key));
		}
		
		hashmap.replace("이십", 200);
		System.out.println(hashmap);
		
		System.out.println(hashmap.size());
		hashmap.remove("이십");
		System.out.println(hashmap);
	}

}
