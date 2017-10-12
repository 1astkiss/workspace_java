package com.list;

import java.util.ArrayList;

public class ArrayListEx07 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);

		System.out.println(al);
		
		/*for(int i = 0; i < al.size(); i++) {
			if(al.get(i).intValue()%2 == 0) {
				al.remove(i);
				i--;
			}
		}*/
		
		for(int i = al.size() - 1; i >= 0; i--) {
			if(al.get(i).intValue()%2 == 0) {
				al.remove(i);
			}
		}
		
		System.out.println(al);
		
	}
	

}
