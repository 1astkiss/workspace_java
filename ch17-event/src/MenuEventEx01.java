import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEventEx01 extends Frame {
	
	MenuBar mb;
	
	public MenuEventEx01() {
		setTitle("MenuEvent Test");
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		
		mb = new MenuBar();
		
		Menu m1 = new Menu("MainMenu1");
		MenuItem m1_mi1 = new MenuItem("SubMenu1");
		MenuItem m1_mi2 = new MenuItem("SubMenu2");
		MenuItem m1_mi3 = new MenuItem("SubMenu3");
		
		m1.add(m1_mi1);
		m1.add(m1_mi2);
		m1.add(m1_mi3);
		
		mb.add(m1);
		
		this.setMenuBar(mb);;
		
		m1.addActionListener(new MenuHandler());
		
	}
	
	public class MenuHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println("SubMenu1 selected");
			
			String command = e.getActionCommand();
			
			if(command.equals("SubMenu3")) {
				System.out.println("program ended");
				System.exit(0);
			}
		}

	
	}

	public static void main(String[] args) {

		MenuEventEx01 me = new MenuEventEx01();
		me.setSize(300,200);
		me.setVisible(true);
		
	}

}
