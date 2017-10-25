package com.filterex;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StreamRWEx01 {

	public static void main(String[] args) {

		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);
		
		try {
			while(true) {
				int i = reader.read();
				
				if(i == -1)
					break;
				
				char c = (char)i;
				System.out.print(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
