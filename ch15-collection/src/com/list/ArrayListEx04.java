package com.list;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("��Ʈ��");
		al.add("ȫ�浿");
		al.add("������");
		al.add("������");
//		al.add(1000);
		al.add("��ũ" + 3);
		
		for(int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			System.out.println(name);
		}
	}

}
