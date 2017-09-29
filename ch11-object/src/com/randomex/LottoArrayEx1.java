package com.randomex;

import java.util.Random;

public class LottoArrayEx1 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		Random gen = new Random();
		
		int i = 1;
		int lottoNum=0;
		
		lotto[0] = gen.nextInt(6)+1;
		
		do{
			
			lottoNum = gen.nextInt(6)+1;
			
			for(int k:lotto) {
				if(k == lottoNum) {
				}else {
					lotto[i]=lottoNum;
					i++;
					break;
				}
			}
			
		}while(i<lotto.length);
			
			for(int j:lotto) 
				System.out.print(j + " ");
	}
	

}
