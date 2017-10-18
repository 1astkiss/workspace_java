package com.component;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx02 extends Frame {
	
	public ButtonEx02() {
		super("Button Test 01");
		setSize(300,300);
		setVisible(true);
		Button b = new Button("»Æ¿Œ");
		b.setSize(100,50);
		
		add(b); 
	}

	public static void main(String[] args) {

		new ButtonEx02();
	}

}
