package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket01 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		OutputStream outputStream = null;
		PrintStream printStream = null;

		try {
			serverSocket = new ServerSocket(8989);
			System.out.println("Server waiting!");
			socket = serverSocket.accept();
			outputStream = socket.getOutputStream();
			printStream = new PrintStream(outputStream);
			printStream.println("Hello, serer connected!!!");
			printStream.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(printStream != null) {
					printStream.close();
				}
				
				if(outputStream != null) {
					outputStream.close();
				}
				
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Server closed");

	}
}
