package com.map;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {

		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(30, "���");
		treemap.put(10, "��");
		treemap.put(50, "����");
		treemap.put(40, "���");
		treemap.put(20, "�̽�");
		
		System.out.println(treemap);
		
		for (int key : treemap.keySet()){
			System.out.println(String.format("key : %d, value : %s", 
					key, treemap.get(key)));
		}
		
		System.out.println();
		
		treemap.remove(40);
		
		Iterator<Integer> keys = treemap.keySet().iterator();
		
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(
					String.format("Key : %s, value : %s", key, treemap.get(key)));
		}
	}

}
