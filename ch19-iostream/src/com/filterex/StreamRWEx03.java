package com.filterex;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamRWEx03 {

	public static void performanceTest(DataOutputStream dataOut) throws IOException {
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; j < 1000; j++) {
				dataOut.writeDouble(12.345);
			}
		}
		
		dataOut.flush();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
	}
	
	public static void main(String[] args) throws IOException {

		OutputStream out1 = new FileOutputStream("filterdata1.bin");
		
		DataOutputStream dataout = new DataOutputStream(out1);
		
		performanceTest(dataout);
		
		dataout.close();
		
		OutputStream out2 = new FileOutputStream("filterdata2.bin");
		BufferedOutputStream buffFilterOut = new BufferedOutputStream(out2, 1024*10);
		DataOutputStream dataBuffOut = new DataOutputStream(buffFilterOut);
		performanceTest(dataBuffOut);
		
		dataBuffOut.close();
		buffFilterOut.close();
		out2.close();
	}

}
