import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx03 extends Frame implements ActionListener {
	
	public static void main(String[] args) {

		new AdapterEx03();
	}

	Panel p1, p2, p3;
	TextField tf;
	TextArea ta;
	Button bClear, bExit;
	
	public AdapterEx03() {
		super("Adapter Class Test");
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		tf = new TextField(35);
		ta = new TextArea(10,35);
		
		bClear = new Button("Clear");
		bExit = new Button("Exit");
		
		
		p1.add(tf);
		p2.add(ta);
		p3.add(bClear);
		p3.add(bExit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
//		setBounds(100,100,300,300);
		pack();
		setVisible(true);
		
		bClear.addActionListener(this);
		bExit.addActionListener(this);
		
		tf.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");
					tf.setText("");;
				}				
			}
			
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String str = e.getActionCommand();
		if(str.equals("Clear")) {
			ta.setText("");
			tf.setText("");
			tf.requestFocus();
		}else if(str.equals("Exit")) {
			System.exit(0);
		}
	}
	
	
}
