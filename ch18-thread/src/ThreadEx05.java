
class ThreadWithClass extends Thread{
	public ThreadWithClass() {
		setName("ThreadWithClass");
	}
	
	@Override
	public void run() {
		for(int i=0; i<5 ;i++) {
			System.out.println(getName());
			
			try {
				sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class ThreadWithRunnable implements Runnable {

	@Override
	public void run() {

		for(int i=0; i<5 ;i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}


public class ThreadEx05  {
	

	public static void main(String[] args) {

		ThreadWithClass thread0 = new ThreadWithClass();
		Thread thread1 = new Thread(new ThreadWithRunnable(), "ThreadWithRunnable");
		
		thread0.start();
		thread1.start();
		
	}

}
