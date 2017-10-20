import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEventEx01 extends Frame {
	
	Scrollbar sb;
	TextField tf;
	
	public AdjustmentEventEx01() {
		setTitle("AdjustmentEvent Test");
		setLayout(new BorderLayout());
		
		sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		tf = new TextField();
		
		add("North", sb);
		add("Center", tf);
		
		sb.addAdjustmentListener(new ScrollbarHandler());
		
		
	}

	public class ScrollbarHandler implements AdjustmentListener{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {

			tf.setText(sb.getValue()+"");
		}
		
	}
	
	public static void main(String[] args) {

		AdjustmentEventEx01 ae = new AdjustmentEventEx01();
		ae.setSize(300,200);
		ae.setVisible(true);
	}

}
