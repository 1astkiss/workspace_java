import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx03 extends Frame implements ActionListener, ItemListener {

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	TextArea ta = new TextArea(5, 20);
	
	Button exit = new Button("exit");
	Checkbox cb1 = new Checkbox("soccer");
	Checkbox cb2 = new Checkbox("basketball");
	Checkbox cb3 = new Checkbox("baseball");
	Checkbox cb4 = new Checkbox("foot volleyball");
	Checkbox cb5 = new Checkbox("volleyball");
	Checkbox cb6 = new Checkbox("dodge ball");
	
	
	public ItemEventEx03() {
		super("ItemEvent Test");
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(cb5);
		p1.add(cb6);
		
		p2.add(exit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
		
		exit.addActionListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new ItemEventEx03();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(e.getItem() + " selected\n");
			if((e.getItem()+"").equals("soccer")) {ta.append("축구선택\n");}
		}else if(e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(e.getItem() + " deselected\n");
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.exit(0);

	}

}
