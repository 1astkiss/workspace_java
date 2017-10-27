package com.chat2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {

	Server server;
	Socket sock;
	
	DataInputStream din;
	DataOutputStream dout;
	
	String ipAddr;
	
	public ServerThread(Server server, Socket socket) {
		this.server = server;
		this.sock = socket;
		
		try {
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			ipAddr = sock.getInetAddress().toString();
			System.out.println(ipAddr + "가 접속하였습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void sendMsg(String msg) {
		try {
			dout.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {

		System.out.println("##ChatThread Started...");
		String str;
		
		while(true) {
		try {
			str = din.readUTF();
			server.sendAll(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
