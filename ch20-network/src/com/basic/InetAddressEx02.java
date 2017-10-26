package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx02 {

	public static void main(String[] args) {

		BufferedReader br = null;
		String url = null;
		InetAddress[] addresses;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("웹사이트 주소 > ");
		try {
			url = br.readLine();
			addresses = InetAddress.getAllByName(url);
			
			for(int i = 0; i < addresses.length; i++) {
				System.out.println(addresses[i]);
			}
			
			System.out.println("Local computer's IP: ");
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
