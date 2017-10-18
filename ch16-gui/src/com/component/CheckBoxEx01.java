package com.component;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckBoxEx01 extends Frame {

	public static void main(String[] args) {

		CheckBoxEx01 cbt = new CheckBoxEx01();
		cbt.setTitle("Checkbox Test");
		cbt.setLayout(new FlowLayout());
		
		Checkbox cb1 = new Checkbox();
		Checkbox cb2 = new Checkbox("Checkbox 2");
		cb1.setLabel("Checkbox 1");
		cb2.setBackground(Color.ORANGE);
		
		cbt.add(cb1);
		cbt.add(cb2);
		cbt.add(new Checkbox("Checkbox 3"));
		cbt.setVisible(true);
		Checkbox cb4 = new Checkbox("Checkbox 4", true);
		cbt.add(cb4);
		cbt.pack();
		
	}

}
