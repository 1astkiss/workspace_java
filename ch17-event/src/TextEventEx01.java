import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventEx01 extends Frame implements ActionListener, TextListener {
	
	TextField tf = new TextField(20);
	Button input = new Button("Input");
	TextArea ta = new TextArea();
	Button exit = new Button("Exit");
	
	public TextEventEx01() {
		super("TextEvent Test");
		
		input.setEnabled(false);
		
		Panel p = new Panel();
		p.add(new Label("Title : "));
		p.add(tf);
		p.add(input);
		
		add("North", p);
		add("Center", ta);
		add("South", exit);
		
		input.addActionListener(this);
		exit.addActionListener(this);
		
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		setBounds(300,300,300,300);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {

		new TextEventEx01();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		if(tf.getText().equals("")) {
			input.setEnabled(false);
		}else {
			input.setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("Input")) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();
		}else if(e.getActionCommand().equals("Exit")) {
			System.exit(0);
		}else {
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();
		}
		
	}

}
