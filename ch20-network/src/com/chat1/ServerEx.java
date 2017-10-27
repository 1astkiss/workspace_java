package com.chat1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	ServerSocket server;
	Socket socket;
	SocketEx client;
	
	public ServerEx() {
		
			try {
				server = new ServerSocket(5000);
				
				while(true) {
					System.out.println("server waiting");
					socket = server.accept();
					client = new SocketEx(this, socket);
					client.start();
					System.out.println("server connected");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		
		ServerEx se = new ServerEx();

	}
}
