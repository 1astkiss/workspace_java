
public class ThreadEx02 extends Thread {
	
	public static void main(String[] args) {

		ThreadEx02 td1 = new ThreadEx02("Thread1");
		ThreadEx02 td2 = new ThreadEx02("Thread2");
		
		td1.start();
		td2.start();
	}

	String tname;
	
	public ThreadEx02(String name) {
		tname = name;
	}

	@Override
	public void run() {

		while(true) {
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(tname);
		}
	}
}
