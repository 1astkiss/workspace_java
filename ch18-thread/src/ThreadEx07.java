
public class ThreadEx07 implements Runnable {

	public static void main(String[] args) {

		ThreadEx07 td = new ThreadEx07();
		Thread t1 = new Thread(td, "1st Thread");
		t1.start();
		Thread t2 = new Thread(td, "2nd Thread");
		t2.start();
		Thread t3 = new Thread(td, "3rd Thread");
		t3.start();
		Thread t4 = new Thread(td, "4th Thread");
		t4.start();
	}

	@Override
	public void run() {

		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread : " + Thread.currentThread().getName());
		}
	}

}
