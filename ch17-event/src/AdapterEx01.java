import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx01 extends Frame {
	
	Button button;
	public AdapterEx01() {
		super("Adapter Class Test");
		setLayout(new FlowLayout());
		
		button = new Button("click exit button");
		add(button);
		
//		this.addWindowListener(new ExitHandler());
		this.addWindowListener(new WindowAdapter() {@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}});
	}

	public class ExitHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {

		AdapterEx01 ae = new AdapterEx01();
		ae.setSize(300,200);
		ae.setVisible(true);
	}

}
