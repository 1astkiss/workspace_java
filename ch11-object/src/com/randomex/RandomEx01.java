package com.randomex;

public class RandomEx01 {

	public static void main(String[] args) {
		
		String[] gift = {"����Ʈ��", "��Ʈ��", "����", "�׺�", "���(��)"};
		
		// 0.0 ~ 0.99999999999999999
		double random = Math.random();
		System.out.println(random);
		
		int idx = (int)(random*5); // 0~4
		System.out.println("�߻��� ����: " + idx);
		System.out.println("���� ���: " + gift[idx]);

	}

}
