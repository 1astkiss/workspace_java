package com.stack;

import java.util.Stack;

public class StackEx03 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		stack.push(40);
		stack.push(20);
		stack.push(50);
		stack.push(30);
		stack.push(10);
		
		System.out.println(stack.peek());
		System.out.println(stack.search(30));
		System.out.println(stack);
	}

}
