package com.component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class LabelEx01 extends Frame {

	Label lbl1, lbl2;
	public LabelEx01() {
	
		setLayout(new FlowLayout());
		lbl1 = new Label("Label 1");
		lbl2 = new Label();
		lbl2.setText("Label 2");
		lbl2.setBackground(Color.orange);
		
		add(lbl1);
		add(lbl2);
		
	}
	
	public static void main(String[] args) {

		LabelEx01 le = new LabelEx01();
		le.setSize(300,200);
		le.setVisible(true);
	}

}
