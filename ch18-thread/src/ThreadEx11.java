
public class ThreadEx11 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + "\t첫번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t두번째 출력");
		
		MyFunnableTwo mrt = new MyFunnableTwo();
		Thread t = new Thread(mrt);
		t.start();
		try{t.join();}catch(Exception e) {e.printStackTrace();}
		System.out.println(Thread.currentThread().getName() + "\t세번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t네번째 출력");
		
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
