package com.component;

import java.awt.Frame;
import java.awt.List;

public class ListEx01 extends Frame {

	public static void main(String[] args) {

		ListEx01 lt = new ListEx01();
		lt.setTitle("List Test");
		List lst = new List(9, true);
//		lst.setMultipleMode(true);
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("Mars");
		lst.add("Jupiter");
		lst.add("Saturn");
		lst.add("Uranus");
		lst.add("Neptune");
		lst.add("Pluto");
		
		lt.add(lst);
		
		String[] items = new String[10];
		
		items = lst.getItems();
		
		for(int i = 0; i < items.length; i++) {
			
			System.out.println(items[i]);
		}
		
		lst.select(1);
		System.out.println("Selected item : " + lst.getSelectedItem());
		lst.select(3);
		System.out.println("2nd item selected? " + lst.isIndexSelected(1));
		System.out.println("3rd item selected? " + lst.isIndexSelected(2));
		
		String[] selItems = new String[9];
		selItems = lst.getSelectedItems();
		
		for(int i = 0; i < selItems.length; i++) {
			if(selItems[i] == "") {
				break;
			}
			System.out.println(selItems[i]);
		}
		
		System.out.println("multi mode : " + lst.isMultipleMode());
		lst.setMultipleMode(false);
		System.out.println("multi mode : " + lst.isMultipleMode());
		
		lst.replaceItem("First List", 0);
		lt.pack();
		lt.setVisible(true);
		
	}

}
