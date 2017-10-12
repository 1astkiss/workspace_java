package com.codelab.gen04;

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
}

public class GenericsEx09 {

	public static void main(String[] args) {

		EmployeeInfo ei = new EmployeeInfo(10);
		Integer id = new Integer(20);
		Person<EmployeeInfo, Integer> p1 = new Person<>(ei, id);
		
		System.out.println(p1.info.position);
		System.out.println(p1.id.intValue());
		
		Person<EmployeeInfo, Integer> p2 = new Person(ei, id);
		System.out.println(p2.info.position);
		System.out.println(p2.id.intValue());
		
//		Person p3 = new Person<EmployeeInfo, Integer>(ei, id);
//		System.out.println(p3.info.position);
//		System.out.println(p3.id.intValue());
		
	}

}
