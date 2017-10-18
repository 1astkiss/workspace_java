package com.awt01;

import java.awt.Button;
import java.awt.Frame;

public class LayoutEx01 extends Frame {
	
	Button btn1, btn2;
	public LayoutEx01() {
		setLayout(null);
		setTitle("Layout Test");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn1.setBounds(0, 30, 150, 170);
		btn2.setBounds(150, 30, 150, 170);
		
		add(btn1);
		add(btn2);
		
		
	}

	public static void main(String[] args) {
		
		LayoutEx01 le = new LayoutEx01();
		le.setVisible(true);
		le.setSize(300,400);
	}

}
