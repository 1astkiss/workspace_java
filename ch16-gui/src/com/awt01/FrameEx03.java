package com.awt01;

import java.awt.Color;
import java.awt.Frame;

public class FrameEx03 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameEx03() {
		super("Frame Test");
		this.setTitle("Frame Test 2");
		this.setSize(400,300);
		this.setBackground(Color.orange);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {

		new FrameEx03();
		
	}

}
