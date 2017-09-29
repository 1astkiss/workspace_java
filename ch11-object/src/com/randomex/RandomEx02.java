package com.randomex;

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {

		String[] luck = {"로또 당첨", "오늘 하루 휴일", "여유로운 하루", "즐거운 만남", 
				"그냥그냥", "헐~"};
		
		Random r1 = new Random();
		// 0~5
		int idx;
		
		for(int i=0;i<20;i++)
		System.out.print(r1.nextInt(20)+",");
		
	}

}
