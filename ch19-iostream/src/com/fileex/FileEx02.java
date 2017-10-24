package com.fileex;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {

		File f1 = new File("c:" + File.separator + "codelab" + File.separator + "sample.txt");
		
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!f1.exists()) {
			System.out.println("file not exists...");
			System.exit(0);
		}else {
			System.out.println("file exists...");
		}
		
		System.out.println("������ : " + f1.getAbsolutePath());
		System.out.println("���丮�� : " + f1.getParent());
		System.out.println("���ϸ� : " + f1.getName());
		System.out.println("����ũ�� : " + f1.length());
		System.out.println("���Ͼ������ : " + f1.canWrite());
		System.out.println("���Ͼ������ : " + f1.canRead());
		
	}

}