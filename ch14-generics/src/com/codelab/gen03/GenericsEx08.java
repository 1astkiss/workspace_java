package com.codelab.gen03;

class EmployeeInfo{
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

public class GenericsEx08 {

	public static void main(String[] args) {

		Person<EmployeeInfo, Integer> p1 = new Person<>(new EmployeeInfo(10), 100);
		System.out.printf("position: %d, id: %d\n", p1.info.position, p1.id);
		System.out.println(p1.id);
		System.out.println(p1.id.intValue());
		
		int a = p1.id;
		System.out.println(a);
	}

}
