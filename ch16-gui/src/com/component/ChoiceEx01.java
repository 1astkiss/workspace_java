package com.component;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceEx01 extends Frame {

	public static void main(String[] args) {

		ChoiceEx01 cht = new ChoiceEx01();
		cht.setTitle("ChoiceBox Test");
		cht.setLayout(new FlowLayout());
		Choice ch = new Choice();
		
		ch.add("Item 1");
		ch.add("Item 2");
		ch.add("Item 3");
		ch.add("Item 4");
		
		cht.add(ch);
		System.out.println("num of items : " + ch.getItemCount());
		System.out.println("2nd item : " + ch.getItem(1) + 1);
		ch.addItem("Item 5");
		ch.select(2);
		System.out.println("3rd item : " + ch.getSelectedIndex());
		
		ch.select("Item 4");
		System.out.println("4th item : " + ch.getSelectedItem());

		cht.setSize(300,200);
		cht.setVisible(true);
		
		for(int i = 0; i < ch.getItemCount(); i++) {
			System.out.println(ch.getItem(i));
		}
	}

}
