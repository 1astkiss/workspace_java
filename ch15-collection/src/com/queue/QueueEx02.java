package com.queue;

import java.util.LinkedList;

public class QueueEx02 {

	public static void main(String[] args) {

		String[] arr = {"���", "���Ȳ�", "����ȭ", "����", "���", "������", "�ҹ̲�"};
		
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
