import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx01 extends Frame implements ItemListener {
	
	List fruits;
	
	public ItemEventEx01() {
		setTitle("ListEvent Test");
		setLayout(new FlowLayout());
		
		fruits = new List();
		fruits.add("Strawberry");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add("Apple");
//		fruits.setMultipleMode(true);;
		fruits.addItemListener(this);
		add(fruits);
	}

	public static void main(String[] args) {

		ItemEventEx01 ie = new ItemEventEx01();
		ie.setSize(300,200);
		ie.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		System.out.println(fruits.getSelectedIndex() + " : " + fruits.getSelectedItem());
	}

}
