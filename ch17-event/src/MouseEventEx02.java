import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx02 extends Frame implements MouseListener {
	
	int x, y;
	
	public MouseEventEx02() {
		setTitle("MouseEvent Test");
		setLayout(new FlowLayout());
		
		this.addMouseListener(this);
	}

	public static void main(String[] args) {

		MouseEventEx02 me = new MouseEventEx02();
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
		x = e.getX();
		y = e.getY();
		
		repaint();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Graphics g) {
//		super.update(g);
		g.drawOval(x, y, 30, 30);
	}
}
