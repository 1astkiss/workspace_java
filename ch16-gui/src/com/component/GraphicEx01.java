package com.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class GraphicEx01 extends Frame {

//	Graphics g;
	
	public GraphicEx01() {
		super("Graphic Test");
		setBounds(100, 100, 400, 300);
		setVisible(true);
	}
	
	
	@Override
	public void paint(Graphics g) {
//		super.paint(g);
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.drawString("Graphics를 이용해서", 10, 50);
		
		g.drawOval(50,  60, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.red);
		g.drawLine(300, 100, 50, 50);
		
		g.setColor(Color.MAGENTA);
		g.fillPolygon(new int[] {50, 100, 150, 200},
				new int[] {250,200, 200, 250},
				4);
		
		g.setColor(Color.pink);
		g.fillArc(250, 200, 100, 100, 0, 240);
		
	}

	public static void main(String[] args) {

		new GraphicEx01();
	}

}
