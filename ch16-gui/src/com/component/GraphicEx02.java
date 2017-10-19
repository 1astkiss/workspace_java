package com.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicEx02 extends Frame {

	public GraphicEx02() {
		super("AWT paint() Test");
		setLayout(new BorderLayout());
		
		Panel p = new Panel(new FlowLayout());
		p.add(new Label("update(), paint()"));

		Button btnRefresh = new Button("Refresh screen");
		p.add(btnRefresh);
		
		btnRefresh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				repaint();
			}
		});
		add("North", p);
	}
	
	
	@Override
	public void paint(Graphics g) {
		System.out.println("paint() called");
		super.paint(g);
		
		g.drawRect(50,80,200,100);
		g.drawString("Paint()", 120, 130);
	}

	@Override
	public void update(Graphics g) {
		System.out.println("update() called");
		super.update(g);
	}


	public static void main(String[] args) {

		GraphicEx02 ge = new GraphicEx02();
		ge.setSize(300, 200);
		ge.setVisible(true);
		
		
	}

}
