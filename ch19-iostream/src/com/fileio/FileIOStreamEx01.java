package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStreamEx01 {

	static final int END_OF_FILE = -1;
	
	public static void main(String[] args) {

		try {
//			FileInputStream fis = new FileInputStream("c://codelab//FirstJava.java");
			File file = new File("c://codelab//FirstJava.java");
			FileInputStream fis = new FileInputStream(file);
			int data;
			
			do {
				data = fis.read();
				System.out.write(data);
			}while(data != -1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
