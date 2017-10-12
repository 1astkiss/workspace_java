package com.codelab.gen06;

abstract class Info {
	public abstract int getInfo();
}

class EmployeeInfo extends Info {

	public int position;
	
	public EmployeeInfo(int position) {
		this.position = position;
	}
	
	@Override
	public int getInfo() {
		return this.position;
	}
	
}

class Person<T extends Info> {
	public T info;
	
	Person(T info) {
		this.info = info;
	}
}

public class GenericsEx11 {

	public static void main(String[] args) {

		Person<EmployeeInfo> p1 = new Person<>(new EmployeeInfo(10)); 
//		Person<String> p2 = new Person<>("CEO");
	}

}
