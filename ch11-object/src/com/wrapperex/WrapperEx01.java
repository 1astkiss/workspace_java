package com.wrapperex;

public class WrapperEx01 {

	public static void main(String[] args) {

		boolean b = true;
		Boolean wrap_boolean = new Boolean(b);
		
		System.out.println("b : " + b);
		System.out.println("wrap_boolean : " + wrap_boolean.booleanValue());

		Integer wrap_integer = new Integer(100);
		
		int i = wrap_integer.intValue();
		System.out.println("i : " + i);
		
		
	} 

}
