package com.randomex;

import java.util.Random;

public class RandomEx06 {

	public static void main(String[] args) {

		Random generator = new Random();
		
		int num1;
		float num2;
		
		num1 = generator.nextInt();
		System.out.println(num1);
		
		// 0~9
		// 0~n-1
		num1 = generator.nextInt(10);
		System.out.println(num1);
		
		// 1~10
		num1 = generator.nextInt(10) +1;
		System.out.println("form 1 to 10:" + num1);
		
		// 1~16
		num1 = generator.nextInt(16) +1;
		System.out.println("form 1 to 16:" + num1);
		
		// 20~25
		num1 = generator.nextInt(6) + 20;
		System.out.println("form 20 to 25:" + num1);
		
		num1 = generator.nextInt(30) - 10;
		System.out.println("form -10 to 19:" + num1);
	}

}
