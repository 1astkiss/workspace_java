package com.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialEx02 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PersonInfo.ser"));
		PersonInfo info = new PersonInfo("Dorothy", "¾ûÁ¡", 27, 1234567);
		info.showPersonInfo();
		out.writeObject(info);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("PersonInfo.ser"));
		PersonInfo recovInfo = (PersonInfo) in.readObject();
		in.close();
		
		recovInfo.showPersonInfo();
	}

}

class PersonInfo implements Serializable {
	String name;
	transient String secretInfo;
	
	int age;
	transient int socialNumber;
	
	public PersonInfo(String name, String sInfo, int age, int sNumber) {
		this.name = name;
		this.secretInfo = sInfo;
		this.age = age;
		this.socialNumber = sNumber;
	}
	
	public void showPersonInfo() {
		System.out.println("Name : " + name);
		System.out.println("Secret Info : " + secretInfo);
		System.out.println("Age : " + age);
		System.out.println("Social Number : " + socialNumber);
	}
	
}