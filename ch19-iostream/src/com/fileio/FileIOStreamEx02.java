package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIOStreamEx02 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		int readbyte = 0;

		try {
			fis = new FileInputStream("c://codelab/file.txt");
			
			while ((readbyte = fis.read()) != -1) {
				System.out.print((char) readbyte);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
