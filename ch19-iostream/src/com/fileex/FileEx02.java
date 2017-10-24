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
		
		System.out.println("절대경로 : " + f1.getAbsolutePath());
		System.out.println("디렉토리명 : " + f1.getParent());
		System.out.println("파일명 : " + f1.getName());
		System.out.println("파일크기 : " + f1.length());
		System.out.println("파일쓰기권한 : " + f1.canWrite());
		System.out.println("파일쓰기권한 : " + f1.canRead());
		
	}

}