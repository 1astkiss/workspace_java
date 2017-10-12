package com.list;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A";
	}
}



public class ArrayListEx01 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		
		a1.add(new A());
		a1.add(new Integer(100));
		a1.add("°èÀı");
		
		System.out.println(a1);
			
	}
	

}
