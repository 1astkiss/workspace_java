package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddressEx01 {

	public static void main(String[] args) {

		BufferedReader br = null;
		String url = null;
		InetAddress address = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("웹사이트주소 > ");
			url = br.readLine();
			address = InetAddress.getByName(url);
			System.out.println("host name : " + address.getHostName());
			System.out.println("host address : " + address.getHostAddress());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

