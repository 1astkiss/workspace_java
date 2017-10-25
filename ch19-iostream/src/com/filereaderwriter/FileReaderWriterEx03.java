package com.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterEx03 {

	public static void main(String[] args) {

		FileReader fr = null;
		int readChar;
		
		try {
			fr = new FileReader("file.txt");
			
			while((readChar=fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
