package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListLotto {

	public static void main(String[] args) {

		ArrayList<Integer> lotto = new ArrayList<>();
		
		Random random = new Random();
		
		Integer it = null;
		
		while(lotto.size() < 6) {
			it = new Integer(random.nextInt(45)+1);
			
			if(!lotto.contains(it)) {
				lotto.add(it);
			}
		}
		
//		lotto.sort(null);
		Collections.sort(lotto);
		System.out.println(lotto);
	}

}
