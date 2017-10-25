package com.filereaderwriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx05 {

	public static void main(String[] args) {

		FileWriter fw = null;
		
		try {
			fw = new FileWriter("fileWriter.txt");
			String message = "FileWriter 테스트중입니다.";
			fw.write(message);
			System.out.println("file created and content saved...");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
