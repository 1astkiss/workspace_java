package com.list;

import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		
		al.add("��Ʈ��");
		al.add("ȫ�浿");
		al.add("���ϴ�");
		al.add("������");
		
		for(String name : al) {
			System.out.println(name);
		}
		
		al.remove(2);
		System.out.println();
		
		for(String name : al) {
			System.out.println(name);
		}
		
		al.remove("ȫ�浿");
		System.out.println();
		for(String name : al) {
			System.out.println(name);
		}
		
		
		
	}

}
