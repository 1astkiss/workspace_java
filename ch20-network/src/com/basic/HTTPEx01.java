package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPEx01 {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.daum.net");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setUseCaches(false);
		conn.setReadTimeout(20000);
		conn.setRequestMethod("POST");
		
		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		for(;;) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			stringBuffer.append(line + "\n");
		}
		
		br.close();
		conn.disconnect();
		
		System.out.println(stringBuffer.toString());
	}

}
