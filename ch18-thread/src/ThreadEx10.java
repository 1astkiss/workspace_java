
class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
//		for(int i = 0; i < 2000000000; i++) {
//			
//		}
		try{sleep(2000);}catch(Exception e) {e.printStackTrace();}
		System.out.println(getName());
	}
}

public class ThreadEx10 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 10; i++) {
			
			Thread thread = new CalcThread("Thread" + i);
			
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
		
	}

}
