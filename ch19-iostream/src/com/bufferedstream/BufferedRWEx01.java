package com.bufferedstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedRWEx01 {

	public static void main(String[] args) {

		String fname, buff, tmp;
		fname = "frw.txt";

		try {
			System.out.println("입력이 끝나면 CTRL-Z 를 누르세요");

			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

			buff = "";
			tmp = r.readLine();

			while (tmp != null) {
				buff += tmp;
				tmp = r.readLine();
			}
			FileWriter fw = new FileWriter(fname);
			fw.write(buff, 0, buff.length());
			fw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
