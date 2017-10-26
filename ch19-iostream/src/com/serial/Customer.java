package com.serial;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Your name is " + name;
	}
}
