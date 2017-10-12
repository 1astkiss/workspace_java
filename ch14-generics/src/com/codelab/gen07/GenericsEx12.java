package com.codelab.gen07;

interface Info {
	int getInfo();
}

class EmployeeInfo implements Info {

	public int position;
	
	public EmployeeInfo(int position) {
		this.position = position;
	}
	
	@Override
	public int getInfo() {
		return this.position;
	}
}

class Person <T extends Info> {
	public T info;
	
	public Person(T info) {
		this.info = info;
		info.getInfo();
	}
	
	public void Persona(T info) {
		this.info = info;
		info.getInfo();
	}
}

public class GenericsEx12 {

	public static void main(String[] args) {

		Person<EmployeeInfo> p1 = new Person<>(new EmployeeInfo(10));
		System.out.println(p1.info.getInfo());
		
//		Person<String> p2 = new Person<String>("cc"));
	}

}
