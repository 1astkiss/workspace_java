package com.awt01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class BorderLayoutEx01 extends Frame {
	
	public BorderLayoutEx01() {
		setTitle("Border Layout Test");
		setSize(300,300);
		setLayout(new BorderLayout());
		Panel pc = new Panel();
		Panel pe = new Panel();
		
		Button btnEast = new Button("east");
		Button btnWest = new Button("west");
		Button btnSouth = new Button("south");
		Button btnNorth = new Button("north");
		Button btnCenter = new Button("center");
		
		pc.add(btnCenter);
		pe.add(btnEast);
		
		add(pe, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnNorth, BorderLayout.NORTH);
		add(pc, BorderLayout.CENTER);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new BorderLayoutEx01();
	}

}
