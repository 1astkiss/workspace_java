
class ThreadTest01 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 2341; i++) {
			System.out.print("-");
		}
		System.out.println("\n- printed ended");
	}
}

class ThreadTest02 extends Thread{
	
	@Override
	public void run() {
//		try{sleep(10);}catch(Exception e) {e.printStackTrace();}
		
		for(int i = 0; i < 2341; i++) {
			System.out.print("+");
		}
		System.out.println("\n+ printed ended");
	}
}


public class ThreadEx08 {
	
	public static void main(String[] args) {

		ThreadTest01 th1 = new ThreadTest01();
		ThreadTest02 th2 = new ThreadTest02();
		
		th1.setPriority(5);
		th2.setPriority(5);

		System.out.println("th1(-) : " + th1.getPriority());
		System.out.println("th2(+) : " + th2.getPriority());
		
		th2.start();
		th1.start();
	}

}
