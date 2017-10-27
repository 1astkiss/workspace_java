package com.chat2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
	
	ServerSocket serv;
	Socket sock;
	
	Vector vector;
	
	public Server() {
		vector = new Vector();
		
		try {
			serv = new ServerSocket(5000);
			System.out.println("[chatServer] Server started...");
			
			while(true) {
				sock = serv.accept();
				ServerThread client = new ServerThread(this, sock);
				client.start();
				
				vector.addElement(client);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendAll(String msg) {
		
		for(int i = 0; i < vector.size(); i++) {
			ServerThread client = (ServerThread)vector.get(i);
			client.sendMsg(msg);
		}
	}

	public static void main(String[] args) {

		Server chats = new Server();
	}

}
