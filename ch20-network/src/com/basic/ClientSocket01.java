package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientSocket01 {

	public static void main(String[] args) {

		String ip = "yahoo.com";
		String pingResult = "";
		String pingCmd = "ping " + ip;

		try {
			Runtime runtime = Runtime.getRuntime();
			Process process = runtime.exec(pingCmd);
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String inputLine;
			
			while((inputLine = input.readLine()) != null) {
				System.out.println(inputLine);
			}
			
			input.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
