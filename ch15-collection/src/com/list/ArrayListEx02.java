package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		
		a1.add("��Ʈ��");
		a1.add("ȫ�浿");
		a1.add("������");
		a1.add("���ϴ�");
		a1.add("���۸�");
		a1.add("�����̴���");

		System.out.println(a1);
		
		for(int i = 0; i < a1.size(); i++ ) {
			String name = (String) a1.get(i);
			System.out.println(name);
			System.out.println(a1.get(i));
		}
	}

}
