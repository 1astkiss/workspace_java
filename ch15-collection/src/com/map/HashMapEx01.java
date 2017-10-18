package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("���", 30);
		hashmap.put("��", 10);
		hashmap.put("����", 50);
		hashmap.put("���", 40);
		hashmap.put("�̽�", 20);
		
		System.out.println(hashmap.keySet());
		
		for(String key : hashmap.keySet()) {
			System.out.println(key + " : " + hashmap.get(key));
		}
		
		hashmap.replace("�̽�", 200);
		System.out.println(hashmap);
		
		System.out.println(hashmap.size());
		hashmap.remove("�̽�");
		System.out.println(hashmap);
	}

}
