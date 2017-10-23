
public class ThreadEx03 {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("시작 Thread: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업스레드: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업스레드: " + threadB.getName());
		threadB.start();
		
		
	}
}

class ThreadA extends Thread {
	
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {

		for(int i = 0; i < 3; i++) {
			try {sleep(0);} catch(Exception e) {};
			System.out.println(getName() + "가 실행"); 
		}
	}
}

class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++) {
			System.out.println(getName() + "가 실행"); 
		}
	}
	
}
