package com.list;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("배트맨");
		al.add("홍길동");
		al.add("일지매");
		al.add("독수리");
		al.add(1000);
		al.add("헐크");
		
		for(int i = 0; i < al.size(); i++) {
			String name = (String) al.get(i);
			System.out.println(name);
		}
	}

}
