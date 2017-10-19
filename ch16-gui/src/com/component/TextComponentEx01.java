package com.component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextComponentEx01 extends Frame {
	
	TextField tf;
	TextArea ta;

	public TextComponentEx01() {
		
		setLayout(new FlowLayout());
		tf = new TextField(30);
		ta = new TextArea(7,30);
		add(tf);
		add(ta);
	}
	
	public static void main(String[] args) {

		TextComponentEx01 tc = new TextComponentEx01();
		tc.setSize(300,200);
		tc.setVisible(true);
		
	}

}
