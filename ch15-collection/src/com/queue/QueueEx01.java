package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {

		Queue q = new LinkedList();
		
		q.offer("10");
		q.offer("20");
		q.offer("30");
		
		
		System.out.println(q);
		System.out.println("Queue");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
	

}
