package com.awt01;

import java.awt.Frame;

public class FrameEx02 extends Frame{
	
	public FrameEx02() {
		
	}

	public static void main(String[] args) {

		FrameEx02 frame = new FrameEx02();
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.setTitle("Frame Test");
		frame.setLocation(200,300);
	}

}
