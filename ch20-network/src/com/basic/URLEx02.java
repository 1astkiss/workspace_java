package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx02 {

	public static void main(String[] args) {

		String address = "http://www.naver.com/index.html";
		URL url = null;
		
		BufferedReader input = null;
		String line = "";
		
		try {
			url = new URL(address);
			InputStream in = url.openStream();
			input = new BufferedReader(new InputStreamReader(in));
			
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
