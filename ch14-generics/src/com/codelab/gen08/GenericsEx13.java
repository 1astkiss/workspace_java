package com.codelab.gen08;

public class GenericsEx13 {
	
	public static <T> void showArrayData(T[] arr) {
		
		for(T str: arr) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		String[] stArr = new String[] {
				"Hi! Everyone!",
				"I'm studying Java",
				"Java Generic Programming",
				"I'm a programmer",
				"Happy Lunch Time!"
		};
		
		showArrayData(stArr);
	}

}
