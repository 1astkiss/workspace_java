
public class ThreadEx11 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + "\tù��° ���");
		System.out.println(Thread.currentThread().getName() + "\t�ι�° ���");
		
		MyFunnableTwo mrt = new MyFunnableTwo();
		Thread t = new Thread(mrt);
		t.start();
		try{t.join();}catch(Exception e) {e.printStackTrace();}
		System.out.println(Thread.currentThread().getName() + "\t����° ���");
		System.out.println(Thread.currentThread().getName() + "\t�׹�° ���");
		
	}

}

class MyFunnableTwo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
}
