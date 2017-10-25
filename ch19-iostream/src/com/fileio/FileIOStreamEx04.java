package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStreamEx04 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		InputStream in = new FileInputStream("origin.bin");
		OutputStream out = new FileOutputStream("copy.bin");
		
		int copyByte = 0;
		int readLen;
		byte buf[] = new byte[1024];
		
		while(true) {
			readLen = in.read(buf);
			
			if(readLen == -1) {
				break;
			}
			
			out.write(buf, 0, readLen);
			copyByte += readLen;
		}
		
		in.close();
		out.close();
		
		System.out.print("byte copied : " + copyByte);
	}

}
