package com.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomerMain1 {

	public static void main(String[] args) {

		System.out.println("객체 직렬화하기");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Customer c = new Customer("Steve(스티브)");
		
		try {
			fos = new FileOutputStream("object.ser");
			oos = new ObjectOutputStream(fos);
			System.out.println(c instanceof Serializable);
			oos.writeObject(c);
			System.out.println("객체직렬화 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
