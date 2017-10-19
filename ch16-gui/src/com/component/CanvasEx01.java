package com.component;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class DrawingCanvas extends Canvas{
	
	@Override
	public void paint(Graphics g) {
//			super.paint(g);
		g.setColor(Color.red);
		g.drawRect(30, 30, 230, 100);
	}
	
}

public class CanvasEx01 extends Frame {
	
	public CanvasEx01() {
		super("Canvas Test");
		DrawingCanvas dc = new DrawingCanvas();
		dc.setSize(200, 100);
		dc.setBackground(Color.yellow);
		add(dc);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new CanvasEx01();
	}

}
