import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx01 extends Frame implements MouseListener {

	public MouseEventEx01() {
		setLayout(new FlowLayout());
		setTitle("MouseEvent Test");
		setBackground(Color.pink);
		
		this.addMouseListener(this);
	}
	public static void main(String[] args) {
		MouseEventEx01 me = new MouseEventEx01();
		me.setSize(300,200);
		me.setVisible(true);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {

		System.out.printf("(%s, %s) ", e.getX(), e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
