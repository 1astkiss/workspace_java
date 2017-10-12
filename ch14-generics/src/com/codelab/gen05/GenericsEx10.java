package com.codelab.gen05;

class EmployeeInfo {
	
	public int position;
	
	public EmployeeInfo(int position) {
		this.position = position;
	}
}

class Person<T, S> {
	public T info;
	public S id;
	
	public Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	public <U> T printData(U info) {
		System.out.println(info);
		return this.info;
	}
}

public class GenericsEx10 {

	public static void main(String[] args) {
		
		EmployeeInfo ei = new EmployeeInfo(10);
		Integer id = 20/*new Integer(20)*/;
		Person<EmployeeInfo, Integer> p1 = new Person<>(ei, id);
		
		p1.<EmployeeInfo>printData(ei);
	}

}
