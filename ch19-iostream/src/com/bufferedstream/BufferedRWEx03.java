package com.bufferedstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRWEx03 {

	public static void main(String[] args) {

		BufferedReader br = null;
		String line = "";

		br = new BufferedReader(new InputStreamReader(System.in));

		try {
			do {
				System.out.print("�����Է� (����: q/Q �Է�) > ");
				line = br.readLine();
				System.out.println("�Է��� ����: " + line);
//		} while (!(line.equals("q") || line.equals("Q")));
			} while (!line.equalsIgnoreCase("q"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("���α׷� ����");;
	}

}
