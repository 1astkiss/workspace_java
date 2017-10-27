package com.basic;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx01 {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://java.sun.com:80/index.jsp?name=honggildong&id=123#content");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getFile());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
