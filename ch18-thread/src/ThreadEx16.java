
public class ThreadEx16 {

	public static void main(String[] args) {

		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
		
	}

}

class StatePrintThread extends Thread {

	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {

		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("Thread : " + state);

			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			if (state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TargetThread extends Thread{
	
	@Override
	public void run() {
		
		for(long i = 0; i < 2000000000; i++) {
			
		}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(long i = 0; i < 2000000000; i++) {
			
		}
		
	}
}