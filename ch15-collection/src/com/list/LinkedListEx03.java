package com.list;

import java.util.LinkedList;

public class LinkedListEx03 {

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("four");
		linkList.add("two");
		linkList.add("five");
		linkList.add("three");
		linkList.add("one");
		
		for(int i = 0; i < linkList.size(); i++) {
			System.out.print(linkList.get(i) + " ");
		}
		
		linkList.remove(1);
		System.out.println();
		
		for(String str : linkList) {
			System.out.print(str + " ");
		}
		
		linkList.set(2, "two");
		System.out.println();
		
		for(String str : linkList) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println("linkList size : " + linkList.size());
		
	}

}
