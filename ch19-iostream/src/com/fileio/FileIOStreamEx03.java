package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStreamEx03 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		byte readArray[];
		
		try {
			
			fis = new FileInputStream("c://codelab/file.txt");
			readArray = new byte[fis.available()];
			fis.read(readArray);
//			for(byte b : readArray) {
//				System.out.print((char)b);
//			}
			
			System.out.print(new String(readArray));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
