
public class ThreadEx04 implements Runnable {

	public static void main(String[] args) {
		
		ThreadEx04 td = new ThreadEx04();
		Thread t = new Thread(td);
		t.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print("Thread : " + Thread.currentThread().getName());
			System.out.println(" temp value : " + i);
		}
		

	}

}
