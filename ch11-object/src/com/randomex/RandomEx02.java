package com.randomex;

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {

		String[] luck = {"�ζ� ��÷", "���� �Ϸ� ����", "�����ο� �Ϸ�", "��ſ� ����", 
				"�׳ɱ׳�", "��~"};
		
		Random r1 = new Random();
		// 0~5
		int idx;
		
		for(int i=0;i<20;i++)
		System.out.print(r1.nextInt(20)+",");
		
	}

}
