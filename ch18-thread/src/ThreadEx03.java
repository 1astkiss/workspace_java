
public class ThreadEx03 {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("���� Thread: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾�������: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾�������: " + threadB.getName());
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
			System.out.println(getName() + "�� ����"); 
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
			System.out.println(getName() + "�� ����"); 
		}
	}
	
}
