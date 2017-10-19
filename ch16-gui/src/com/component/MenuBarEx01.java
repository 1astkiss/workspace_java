package com.component;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuBarEx01 extends Frame {
	
	MenuBar mb;
	
	public MenuBarEx01() {
		super("Menu Test");
		mb = new MenuBar();
		
		Menu mn_mode = new Menu("Mode");
		Menu mn_options = new Menu("Options");
		Menu mn_help = new Menu("Help");
		
		MenuItem basic = new MenuItem("Basic");
		MenuItem advance = new MenuItem("Advance");
		CheckboxMenuItem check1 = new CheckboxMenuItem("Expert", true);
		
		Menu mn_morelang = new Menu("More Language");
		MenuItem mi1 = new MenuItem("C");
		MenuItem mi2 = new MenuItem("HTML5");
		MenuItem mi3 = new MenuItem("Java");
		MenuItem mi4 = new MenuItem("Android");
		
		CheckboxMenuItem check2 = new CheckboxMenuItem("Check");
		
		mn_morelang.add(mi1);
		mn_morelang.add(mi2);
		mn_morelang.add(mi3);
		mn_morelang.add(mi4);
		mn_morelang.add(check2);
		
		MenuItem exit = new MenuItem("Exit");
		
		mn_mode.add(basic);
		mn_mode.add(advance);
		mn_mode.add(check1);
		mn_mode.addSeparator();
		mn_mode.add(mn_morelang);
		mn_mode.addSeparator();
		mn_mode.add(exit);

		MenuItem userdefine = new MenuItem("User define");
		MenuItem windowsetting = new MenuItem("Window Setting");
		mn_options.add(userdefine);
		mn_options.add(windowsetting);
		
		MenuItem about = new MenuItem("About");
		mn_help.add(about);
		
		mb.add(mn_mode);
		mb.add(mn_options);
		mb.add(mn_help);
		
		setMenuBar(mb);
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new MenuBarEx01();
	}

}
