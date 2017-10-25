package com.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWEx02 {

	public static void main(String[] args) throws IOException {

		BufferedWriter out = new BufferedWriter(
				new FileWriter("String.txt"));
		
		System.out.println("입력시작");
		
		out.write("A B C D E F G");
		out.newLine();
		out.write("가 나 다 라 마 바 사");
		out.newLine();
		out.write("H I J K L M N");
		out.newLine();
		out.write("아 자 차 카 타 파 하");
		out.newLine();
		out.newLine();
		out.write("O P Q R S T U V W X Y Z");
		out.newLine();
		out.close();
		
		System.out.println("입력종료");
	}

}
