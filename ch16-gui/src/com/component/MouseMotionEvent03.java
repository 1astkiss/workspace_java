package com.component;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvent03 extends Frame implements MouseMotionListener {

	Label move = new Label("****", Label.CENTER);
	
	public MouseMotionEvent03() {
	
		setTitle("MouseMotionEvent Test");
		move.setForeground(Color.red);
		move.setBackground(Color.ORANGE);
		
		setLayout(null);
		move.setSize(100, 20);

		
		this.addMouseMotionListener(this);
		add(move);
		
		setBounds(300,300,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new MouseMotionEvent03();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		move.setLocation(e.getPoint());
	}

}
