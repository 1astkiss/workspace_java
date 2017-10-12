package com.list;

import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		
		al.add("배트맨");
		al.add("홍길동");
		al.add("강하늘");
		al.add("일지매");
		
		for(String name : al) {
			System.out.println(name);
		}
		
		al.remove(2);
		System.out.println();
		
		for(String name : al) {
			System.out.println(name);
		}
		
		al.remove("홍길동");
		System.out.println();
		for(String name : al) {
			System.out.println(name);
		}
		
		
		
	}

}
