import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx01 extends Frame implements KeyListener {
	
	TextArea ta = new TextArea();
	
	
	public KeyEventEx01() {
		super("KeyEvent Test");
		add(ta);
		
		ta.addKeyListener(this);
		
		setBounds(300,300,300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new KeyEventEx01();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			ta.append("UP Key\n");
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			ta.append("Down Key\n");
			
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			ta.append("Left Key\n");
			
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			ta.append("Right Key\n");
		}else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			ta.append("Enter Key\n");
		}
		
		
		ta.append(e.getKeyChar() + " key pressed\n");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		ta.append(e.getKeyChar() + " key released\n");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		ta.append(e.getKeyChar() + " key typed\n");
		
	}

}
