package com.chat2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Frame implements Runnable {

	TextField tf;
	TextArea ta;
	Socket sock;
	DataInputStream din;
	DataOutputStream dout;

	public Client() {
		this.setLayout(new FlowLayout());
		this.setVisible(true);

		tf = new TextField(30);
		ta = new TextArea(7, 30);

		this.add(tf);
		this.add(ta);

		tf.addActionListener(new TfHandler());
	}

	public void sendMsg(String msg) {

		try {
			dout.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public class TfHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			sendMsg("[김인수]" + tf.getText());
			tf.setText("");
		}

	}

	@Override
	public void run() {

		try {
			sock = new Socket("192.168.101.188", 5000);
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			ta.append("서버에 접속되었습니다.\n");

			while (true) {
				String str = din.readUTF();
				ta.append(str + "\n");
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				din.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Client chatc = new Client();
		chatc.setSize(300,200);
		chatc.setVisible(true);
		
		Thread t = new Thread(chatc);
		t.start();
	}
}