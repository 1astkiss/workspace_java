package com.component;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RadioButtonEx01 extends Frame{
	
	public static void main(String[] args) {

		RadioButtonEx01 cbt = new RadioButtonEx01();
		cbt.setTitle("RadioButton Test");
		cbt.setLayout(new FlowLayout());
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Radio Button 1",cbg, false);
		Checkbox cb2 = new Checkbox("Radio Button 2",cbg, false);
		Checkbox cb3 = new Checkbox("Radio Button 3",cbg, false);
		Checkbox cb4 = new Checkbox("Radio Button 4",cbg, false);

		cbt.add(cb1);
		cbt.add(cb2);
		cbt.add(cb3);
		cbt.add(cb4);
		
		cbt.pack();
		cbt.setVisible(true);
	}

}
