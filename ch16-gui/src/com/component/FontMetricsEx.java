package com.component;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontMetricsEx extends Frame {

	public static void main(String[] args) {

		FontMetricsEx fe = new FontMetricsEx();
		fe.setTitle("FontMetrics");
		fe.setSize(300,200);
		fe.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
//		super.paint(g);
		Font serif = new Font("Serif", Font.PLAIN, 15);
		g.setFont(serif);
		g.drawString("Serif plain 12", 30, 50);
		
		int ascent, descent, height, leading;
		ascent = g.getFontMetrics().getAscent();
		descent = g.getFontMetrics().getDescent();
		height = g.getFontMetrics().getHeight();
		leading = g.getFontMetrics().getLeading();
		
		g.drawString("Ascent: " + ascent, 30, 75);
		g.drawString("Descent: " + descent, 30, 90);
		g.drawString("Height: " + height, 30, 105);
		g.drawString("Leading: " + leading, 30, 120);
	}

}
