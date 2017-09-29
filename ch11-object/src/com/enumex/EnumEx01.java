package com.enumex;

enum Rainbow{
	//1000  10001      2       3      4      5      7
	RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
	// PI 3.14
}


public class EnumEx01 {

	public static void main(String[] args) {

		Rainbow[] arr = Rainbow.values();
		
		for(Rainbow rb  : arr) {
			System.out.println(rb);
		}
		
		Rainbow rb = Rainbow.valueOf("BLUE");
		System.out.println(rb);
		
		int idx = Rainbow.YELLOW.ordinal();
		System.out.println(idx);
		
		
		
	}
}
