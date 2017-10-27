package com.chat1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketEx extends Thread {
	
	ServerEx server;
	Socket socket;
	
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	String ipAddress;
	
	public SocketEx(ServerEx server, Socket socket) {
		
		this.server = server;
		this.socket = socket;
		
		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			ipAddress = socket.getInetAddress().toString();
			System.out.println(ipAddress + "가 접속하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	@Override
	public void run() {
		String str;
		
		try {
			while(true) {
				str = dataInputStream.readUTF();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
