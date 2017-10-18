package com.awt01;

import java.awt.Frame;
import java.awt.Window;

public class FrameEx01 {

	public static void main(String[] args) {

		Frame frame = new Frame("Frame Test");
		frame.setSize(400, 300);
		frame.setVisible(true);
		
		Window window = new Window(frame);
		window.setSize(500, 400);
		window.setVisible(true);
		window.setLocation(500,400);
		
	}

}
