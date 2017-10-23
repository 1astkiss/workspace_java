
public class ThreadEx01 extends Thread {

	public static void main(String[] args) {
		
		(new ThreadEx01("1st")).start(); 
		
		for(int i = 0; i < 10; i++) System.out.println("ddd");
		
	}
	
	public ThreadEx01(String threadName) {
		super(threadName);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.print("Thread : " + currentThread().getName());
			System.out.println("  temp value : " + i);
		}
	}


}
