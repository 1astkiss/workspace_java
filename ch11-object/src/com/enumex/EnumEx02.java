package com.enumex;

enum Rainbow_irregular{
	
	RED(3), ORANGE(10), YELLOW(31), GREEN(7), 
	BLUE(1), INDIGO(-2), VIOLET(-11);
	
	private final int value;
	
	Rainbow_irregular(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}


public class EnumEx02 {

	public static void main(String[] args) {
		Rainbow_irregular[] arr = Rainbow_irregular.values();
		
		for(Rainbow_irregular rb : arr) {
			System.out.println(rb);;
		}
		
		int idx = Rainbow_irregular.ORANGE.getValue();
		System.out.println(idx);
		System.out.println(Rainbow_irregular.values()[0]);
		
	}
}
