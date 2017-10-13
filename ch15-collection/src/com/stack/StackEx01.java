package com.stack;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {

		Stack stack = new Stack<>();
		stack.push("10");
		stack.push("20");
		stack.push("30");
		
		System.out.println(stack.isEmpty());
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println(stack);
		
	}

}
