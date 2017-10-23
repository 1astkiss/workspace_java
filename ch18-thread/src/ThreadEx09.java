

class ThreadPriority extends Thread{
	String message;
	
	public ThreadPriority(String str, int priority) {
		message = str;
		setPriority(priority);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(message + "(" + getPriority() + ")");
			try{sleep(1);}catch(Exception e) {e.printStackTrace();}
			
		}
	}
}

public class ThreadEx09 {

	public static void main(String[] args) {

		ThreadPriority tr1 = new ThreadPriority("First", Thread.MAX_PRIORITY);
		ThreadPriority tr2 = new ThreadPriority("Second", Thread.NORM_PRIORITY);
		ThreadPriority tr3 = new ThreadPriority("Third", Thread.MIN_PRIORITY);
				
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
