package com.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderWriterEx02 {

	public static void main(String[] args) throws IOException {

		char[] cbuf = new char[10];
		int readCnt;

		Reader in = new FileReader("FileReaderWriter.txt");
		
		do {
			readCnt = in.read(cbuf, 0, cbuf.length);
			System.out.println(readCnt);

			for (int i = 0; i < readCnt; i++) {
				System.out.print(cbuf[i]);
			}
		} while (readCnt != -1);

		in.close();
	}

}
