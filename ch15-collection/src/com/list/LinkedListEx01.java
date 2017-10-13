package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println(add_order(al));
		System.out.println(add_order(ll));
		
		System.out.println(add_middle(al));
		System.out.println(add_middle(ll));
		
		System.out.println(remove_middle(al));
		System.out.println(remove_middle(ll));
		
		System.out.println(remove_order(al));
		System.out.println(remove_order(ll));
		
	}
	
	public static long add_order(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1000000; i++) {
			list.add(i+"");
		}
			
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	public static long add_middle(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.add(500, i+"");			
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove_middle(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.remove(i);			
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove_order(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);			
		}
		
//		list.clear();
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	

}
