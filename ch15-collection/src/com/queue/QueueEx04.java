package com.queue;

import java.util.LinkedList;

public class QueueEx04 {

	public static void main(String[] args) {

		String[] item = {"BMW", "Tesla", "Jaguar"};
		LinkedList<String> q = new LinkedList<>();
		
		for(String n : item) {
			q.offer(n);
		}
		
		System.out.println("q의 크기" + q.size());
		
		String data = "";
		
		while(null != (data=q.poll())) {
			System.out.println(data + " 삭제!");
		}
		
		System.out.println("q의 크기" + q.size());
		
	}

}
