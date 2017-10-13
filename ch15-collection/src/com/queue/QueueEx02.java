package com.queue;

import java.util.LinkedList;

public class QueueEx02 {

	public static void main(String[] args) {

		String[] arr = {"장미", "나팔꼿", "무궁화", "백합", "목련", "개나리", "할미꽃"};
		
		LinkedList<String> queue = new LinkedList<>();
		
		for(int i = 0; i < arr.length; i++) {
			queue.offer(arr[i]);
		}
		
		System.out.println(queue);
	
		while(queue.peek() != null)	{
			System.out.println(queue.poll());
		}
		
	}
}
