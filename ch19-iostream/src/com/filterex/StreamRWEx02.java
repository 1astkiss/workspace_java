package com.filterex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamRWEx02 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("datastream.bin");
		OutputStream out = new FileOutputStream("datacopy.bin");
		
		BufferedInputStream bin = new BufferedInputStream(in); 
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int copyByte = 0;
		int bData;
		
		while(true) {
			bData = bin.read();
			
			if(bData == -1) {
				break;
			}
			
			bout.write(bData);
			copyByte++;
			
		}
		
		System.out.print(copyByte);
		bout.close();
		bin.close();
		out.close();
		in.close();
	}

}
