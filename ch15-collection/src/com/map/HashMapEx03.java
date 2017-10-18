package com.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx03 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("myId", "password");
		map.put("code", "2017");
		map.put("dragon", "2018");
		System.out.println(map.put("dragon", "2020"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("id > ");
			String id = scanner.nextLine().trim();
			System.out.print("password > ");
			String password = scanner.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.print("id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("��й�ȣ ����ġ. �ٽ� �Է����ּ���");
				} else {
					System.out.println("id�� ��й�ȣ ��ġ");
					break;
				}
			}
		}
		
		scanner.close();
	}

}
