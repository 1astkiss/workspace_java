package com.randomex;

public class RandomEx01 {

	public static void main(String[] args) {
		
		String[] gift = {"스마트폰", "노트북", "빌딩", "테블릿", "대박(꽝)"};
		
		// 0.0 ~ 0.99999999999999999
		double random = Math.random();
		System.out.println(random);
		
		int idx = (int)(random*5); // 0~4
		System.out.println("발생한 난수: " + idx);
		System.out.println("추점 결과: " + gift[idx]);

	}

}
