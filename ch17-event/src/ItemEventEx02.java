import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx02 extends Frame implements ActionListener, ItemListener {

	List sports;
	TextArea ta;
	
	
	public ItemEventEx02() {
	
		setTitle("Popular Sports");
		setLayout(new BorderLayout());
		
		sports = new List();
		ta = new TextArea();
		
		sports.add("Soccer");
		sports.add("Cricket");
		sports.add("Field Hockey");
		sports.add("Tennis");
		sports.add("Volleyball");
		sports.add("Baseball");
		
		sports.addActionListener(this);
		sports.addItemListener(this);
		
		add("North", sports);
		add("Center", ta);
	}
	
	public static void main(String[] args) {
		ItemEventEx02 le = new ItemEventEx02();
		le.setSize(300,200);
		le.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		ta.append(sports.getSelectedItem() + " from @ActionEvent\n");;
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		ta.append(sports.getSelectedItem() + " from !ItemEvent\n");;
		
	}

}
