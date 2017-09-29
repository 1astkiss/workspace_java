package com.randomex;

import java.util.Random;

public class RandomEx04 {

	public static void main(String[] args) {
		
		Random  rand = new Random();
		Random  rand2 = new Random();
		
		for(int i=0; i<10 ; i++) {
			System.out.print(rand.nextInt(100)+",");
		}
		
		System.out.println();
		for(int i=0; i<10 ; i++) {
			System.out.print(rand2.nextInt(100)+",");
		}
	}

}
