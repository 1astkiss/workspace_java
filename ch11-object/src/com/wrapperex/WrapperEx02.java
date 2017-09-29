package com.wrapperex;

public class WrapperEx02 {

	public static void main(String[] args) {

		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer(20);
		
		int sum = obj1.intValue() + obj2.intValue();
		
		System.out.println("sum : " + sum);
		System.out.println(obj1.equals(obj2));
				
		int result1 = obj1 * obj2;
		System.out.println("result1 : " + result1);
		
		Integer obj3 = 15;
		Integer obj4 = 20;
		
		Integer result2 = obj3 + obj4;
		System.out.println("result2 : " + result2);
		
	}

}
