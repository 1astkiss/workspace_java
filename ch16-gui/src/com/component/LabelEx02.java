package com.component;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class LabelEx02 extends Frame {
	
	public void printAlignment(int state) {
		switch(state){
			case 0:
				System.out.println("Left Aligned");
				break;
			case 1:
				System.out.println("Center Aligned");
				break;
			case 2:
				System.out.println("Right Aligned");
				break;
		}
	}

	public static void main(String[] args) {

		LabelEx02 lt = new LabelEx02();
		lt.setTitle("Label Test Windwo");
		lt.setLayout(new GridLayout(3,2));
		
		Label label1 = new Label();
		label1.setText("Label 1");
		label1.setAlignment(Label.LEFT);
		lt.add(label1);
		
		Label label2 = new Label("Label 2");
		lt.add(label2);
		label2.setAlignment(Label.CENTER);
		
		Label label3 = new Label("Label 3", Label.RIGHT);
		lt.add(label3);
		
		System.out.print(label1.getText() + " is ");
		lt.printAlignment(label1.getAlignment());
		System.out.print(label2.getText() + " is ");
		lt.printAlignment(label2.getAlignment());
		System.out.print(label3.getText() + " is ");
		lt.printAlignment(label3.getAlignment());
		
		lt.setSize(200, 100);
//		lt.pack();
		lt.setVisible(true);
	}

}
