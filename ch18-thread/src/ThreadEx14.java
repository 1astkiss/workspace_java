
public class ThreadEx14 {

	public static void main(String[] args) {

		ATM atm = new ATM();
		Thread mother = new Thread(atm, "mother");
		mother.start();

		Thread son = new Thread(atm, "son");
		son.start();
	}

}

class ATM implements Runnable {

	private int depositMoney = 10000;

	public void withDraw(int howMuch) {

		if (depositMoney > 0) {
			synchronized (this) {
				depositMoney -= howMuch;
				System.out.println(Thread.currentThread().getName() + " : " + depositMoney);
			}
		} else {
			System.out.println(Thread.currentThread().getName() + "잔액이 부족합니다.");
		}
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (depositMoney <= 0) {
				break;
			}

			withDraw(1000);
		}
	}

}