import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx01 extends Frame implements WindowListener  {
	
	Label lb;
	
	public WindowEventEx01() {
		super("WindowEvetn Test");
		
		lb = new Label("click frame exit button");
		
		add(lb);
//		this.addWindowListener(this);
		
		setBounds(100,100,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new WindowEventEx01();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
