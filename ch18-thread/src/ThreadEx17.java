
public class ThreadEx17 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println("Knock knock");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
