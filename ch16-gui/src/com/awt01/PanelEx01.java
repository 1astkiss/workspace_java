package com.awt01;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelEx01 extends Frame {
	
	public PanelEx01() {
		setLayout(new FlowLayout());
		setTitle("Panel Test");
		setSize(400,300);
		setBackground(Color.CYAN);
		setVisible(true);
		
		Panel p = new Panel();
		p.setBackground(Color.orange);
		p.setVisible(true);
		p.setSize(100,100);
		p.setLocation(100, 200);
		add(p);
		
		Button b = new Button("OK");
		p.add(b);
	}

	public static void main(String[] args) {

		new PanelEx01();
		Panel p = new Panel();
		p.setBackground(Color.orange);
		p.setVisible(true);
		p.setSize(100,100);
		p.setLocation(100, 200);
	}

}
