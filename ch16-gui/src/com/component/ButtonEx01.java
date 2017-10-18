package com.component;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ButtonEx01 extends Frame {
	
	Button button1, button2;
	
	public ButtonEx01() {
		setLayout(new FlowLayout());
		button1 = new Button("Button1");
		button2 = new Button();
		button2.setLabel("Button2");
		add(button1);
		add(button2);
	}

	public static void main(String[] args) {

		ButtonEx01 be = new ButtonEx01();
		be.setSize(300,100);
		be.setVisible(true);
		
	}

}
