package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamEx05 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			
			fos = new FileOutputStream("c:" + File.separator + "CodeLab" + File.separator + "fileout.txt", false);
			String message = "Hello File Out!! 파일의 내용입니다.";
			fos.write(message.getBytes());
			System.out.println("파일 생성후 내용");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		;
	}

}
