package com.basic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionEx01 {

	public static void main(String[] args) {

		URL url = null;
		URLConnection uc = null;

		try {
			url = new URL("http://www.naver.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		try {
			uc = url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(uc);
		System.out.println(uc.getAllowUserInteraction());
		try {
			System.out.println(uc.getContent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(uc.getContentEncoding());
		System.out.println(uc.getContentLength());
		System.out.println(uc.getContentType());
		System.out.println(new Date(uc.getDate()));
	}
}
