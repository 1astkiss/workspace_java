package com.stack;

import java.util.Stack;

public class StackEx02 {

	public static void main(String[] args) {

		String[] arr = {"Seoul", "Taejeon", "Daegoo", "Busan", "touch", "Kwangju", "Incheon"};
		Stack<String> stk = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			stk.push(arr[i]);
		}
		
		System.out.println(stk);
	}

}
