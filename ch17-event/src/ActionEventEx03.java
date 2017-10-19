import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;

//class TextEventHandler implements TextListener{
	class TextEventHandler implements ActionListener{
	
	TextField tf;
	TextArea ta;
	
	public TextEventHandler(TextField tf, TextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}

//	@Override
//	public void textValueChanged(TextEvent e) {
//		System.out.println(tf.getText());
//		ta.append(tf.getText() + "\n");
//	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(tf.getText());
		ta.append(tf.getText() + "\n");		
	}
	
}

public class ActionEventEx03 extends Frame {
	
	TextField tf;
	TextArea ta;
	
	public ActionEventEx03() {
		super("ActionEVent Test");
		this.setLayout(new BorderLayout());
		tf = new TextField();
		ta  = new TextArea();
		
		TextEventHandler txtHandler = new TextEventHandler(tf, ta);
		
//		tf.addTextListener(txtHandler);
		tf.addActionListener(txtHandler);
		
		this.add(BorderLayout.NORTH, tf);
		this.add(BorderLayout.CENTER, ta);
		
	}

	public static void main(String[] args) {

		ActionEventEx03 ae = new ActionEventEx03();
		ae.setSize(300,200);
		ae.setVisible(true);
	}

}
