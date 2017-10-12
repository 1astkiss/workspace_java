package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		
		a1.add("배트맨");
		a1.add("홍길동");
		a1.add("일지매");
		a1.add("강하늘");
		a1.add("슈퍼맨");
		a1.add("스파이더맨");

		System.out.println(a1);
		
		for(int i = 0; i < a1.size(); i++ ) {
			String name = (String) a1.get(i);
			System.out.println(name);
			System.out.println(a1.get(i));
		}
	}

}
