import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class ThreadEx06 extends Frame implements Runnable {
	
	public static void main(String[] args) {

		ThreadEx06 te = new ThreadEx06();
		te.setSize(300,300);
		te.setVisible(true);
		
		Thread th = new Thread(te);
		th.start();		
		
	}
	

	int x, y;
	
	public ThreadEx06() {
		setTitle("Thread Test");
	}

	@Override
	public void run() {

		while(true) {
			x = (int) (Math.random() * 300);
			y = (int) (Math.random() * 300);
			
			System.out.println(x+y);
			
			repaint();
			
			try {Thread.sleep(100);}catch(Exception e) {e.printStackTrace();};
		}
	}
	
	@Override
	public void update(Graphics g) {
		System.out.println("update started" + x + y);
		g.setColor(Color.orange);
		g.drawOval(x, y, 30, 30);
	}
}
