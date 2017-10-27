package com.chat1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientEx {

	static String serverIP = "192.168.101.188";
	
	public static void main(String[] args) {

		try {
			
			String str;
			
			Socket socket = new Socket(serverIP, 5000);
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			System.out.println("서버에 접속되었습니다.");
			
			while(true) {
				str = dataInputStream.readUTF();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
