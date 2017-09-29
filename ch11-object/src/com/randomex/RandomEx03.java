package com.randomex;

import java.util.Random;

public class RandomEx03 {
	
	public static void main(String[] args) {
	
	Random rd = new Random();
	
	for(int i=1;i<=100;i++) {
		System.out.print(rd.nextInt(2000) + ",");
		if((i)%10==0) System.out.println();
	}
	}
}
