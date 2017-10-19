import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx02 extends Frame implements ActionListener {

	Panel p;
	Button input, exit;
	TextArea ta;
	
	
	public ActionEventEx02() {
		super("ActionEvent Test");
		
		p = new Panel();
		
		input = new Button("Input");
		exit = new Button("Exit");
		
		input.addActionListener(this);
		exit.addActionListener(this);
		
		ta = new TextArea();
		
		p.add(input);
		p.add(exit);
		
		this.add(p, BorderLayout.NORTH);
		this.add(ta, BorderLayout.CENTER);
		
		this.setBounds(300,300,300,300);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String name = e.getActionCommand();
		
		if(name.equals("Input")) {
			ta.append("button clicked...\n");
		}else {
			System.exit(0);
		}
	}



	public static void main(String[] args) {

		new ActionEventEx02();
		
		
	}

}
