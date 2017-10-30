package com.breakpointex;

public class LabEx01 {

	public static void main(String[] args) {

		int total = 0;
		
		for(int i = 1; i <= 100; i++) {
			total += i;
			System.out.println("1부터 " + i + "가지의 합은 " + total + "입니다.");
		}
	}

}
