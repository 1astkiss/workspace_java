package com.queue;

import java.util.LinkedList;

public class QueueEx03 {

	public static void main(String[] args) {

		LinkedList<String> queue = new LinkedList<String>();
		
		queue.add("four");
		queue.add("two");
		queue.add("five");
		queue.add("three");
		queue.add("one");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
		queue.remove("three");
		System.out.println(queue);
		
	}
}
