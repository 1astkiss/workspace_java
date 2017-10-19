package com.component;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontEx01 extends Frame {
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
//		super.paint(g);
		Font serif = new Font("Serif", Font.PLAIN, 12);
		Font monospaced = new Font("Monospaced", Font.ITALIC, 24);
		Font sansSerif = new Font("SansSerif", Font.BOLD, 10);
		Font clearGothic = new Font("¸¼Àº°íµñ", Font.BOLD, 20);
		
		g.setFont(serif);
		g.drawString("Serif plain 12", 30, 50);
		
		g.setFont(monospaced);
		g.drawString("Monospaced italic 24", 30, 80);
		
		g.setFont(sansSerif);
		g.drawString("SansSerif bold 10", 30, 110);
		
		g.setFont(clearGothic);
		g.drawString("¸¼Àº°íµñ bold 20", 30, 140);
	}

	public static void main(String[] args) {

		FontEx01 fe = new FontEx01();

		fe.setTitle("Font Style");
		fe.setSize(500,300);
		fe.setVisible(true);
	}

}
