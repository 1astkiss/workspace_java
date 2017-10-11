package com.codelab.gen02;

import com.codelab.gen02.EmployeeInfo;
import com.codelab.gen02.Person;

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

class Person<T> {
	public T info;
	
	Person(T info) {
		this.info = info;
	}
}

public class GenericsEx06 {

	public static void main(String[] args) {

		Person<EmployeeInfo> ep = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(ep.info.position);

		Person ep2 = new Person(new EmployeeInfo(20));
		System.out.println(((EmployeeInfo)ep2.info).position);
		
		Person ep3 = new Person("ªÁ¿Â");
//		System.out.println((EmployeeInfo)ep3.info.position);
		
		Person<StudentInfo> sp = new Person<StudentInfo>(new StudentInfo(30));
		System.out.println(sp.info.grade);
		
	}

}
