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
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id > ");
			String id = scanner.nextLine().trim();
			System.out.print("password > ");
			String password = scanner.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.print("id가 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호 불일치. 다시 입력해주세요");
				} else {
					System.out.println("id와 비밀번호 일치");
					break;
				}
			}
		}
		
		scanner.close();
	}

}
