package com.codelab.gen01;

class StudentInfo {
	public int grade;
	
	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int position;
	
	EmployeeInfo(final int position) {
		this.position = position;
	}
}

class Person {
	public Object info;
	
	Person(Object info) {
		this.info = info;
	}
}

public class GenericsEx05 {

	public static void main(String[] args) {

		Person ep2 = new Person(new EmployeeInfo(20));
		System.out.println(((EmployeeInfo)ep2.info).position);
		
		Person p1 = new Person("ªÁ¿Â");
		EmployeeInfo ei1 = (EmployeeInfo)p1.info;
		System.out.println(ei1.position);
	}

}
