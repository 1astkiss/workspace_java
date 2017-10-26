package com.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomerMain1 {

	public static void main(String[] args) {

		System.out.println("��ü ����ȭ�ϱ�");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Customer c = new Customer("Steve(��Ƽ��)");
		
		try {
			fos = new FileOutputStream("object.ser");
			oos = new ObjectOutputStream(fos);
			System.out.println(c instanceof Serializable);
			oos.writeObject(c);
			System.out.println("��ü����ȭ �Ϸ�");
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
