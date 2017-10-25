package com.filereaderwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterEx04 {

	public static void main(String[] args) throws IOException {

		File file = new File("c://codelab//firstjava.java");
		
		FileReader fr = new FileReader(file);
		
		int readCharNo;
		
		char[] cbuf = new char[100];
		
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		
		fr.close();
		
	}

}
