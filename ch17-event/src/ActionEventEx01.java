import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx01 extends Frame {

	Button button;
	
	public ActionEventEx01() {
		setTitle("MouseEvent Test");
		setLayout(new FlowLayout());
		
		button = new Button("Click me");
		ButtonHandler btnHandler = new ButtonHandler();
		button.addActionListener(btnHandler);			
				
		this.add(button);
	}
	
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button Clicked");
		}
		
	}
	
	public static void main(String[] args) {
		ActionEventEx01 ae = new ActionEventEx01();
		ae.setSize(300,200);
		ae.setVisible(true);
	}

}
