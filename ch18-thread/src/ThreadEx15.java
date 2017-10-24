
public class ThreadEx15 {

	public static void main(String[] args) {

		TargetNum bb = new ThreadEx15().new TargetNum();
		IHaveTwoNum numInst = new ThreadEx15().new IHaveTwoNum(bb);

		AccessThread at1 = new ThreadEx15().new AccessThread(numInst);
		AccessThread at2 = new ThreadEx15().new AccessThread(numInst);

		at1.start();
		at2.start();

//		 try {
//		 at1.join();
//		 at2.join();
//		 } catch (InterruptedException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }

		numInst.showAllNums();

	}

	class TargetNum {
		int num1;
		int num2;

		public TargetNum() {
			num1 = 0;
			num2 = 0;
		}
	}

	class IHaveTwoNum {
		TargetNum aa;

		public IHaveTwoNum(TargetNum bb) {
			this.aa = bb;
		}

		public void addOneNum1() {
			synchronized (aa) {
				aa.num1 += 1;
				System.out.println("addOneNum1 : " + aa.num1);
			}
		}

		public void addTwoNum1() {
			synchronized (aa) {
				aa.num1 += 2;
				System.out.println("addTwoNum1 : " + aa.num1);
			}
		}

		public void addOneNum2() {
			synchronized (aa) {
				aa.num2 += 1;
				System.out.println("addOneNum2 : " + aa.num2);
			}
		}

		public void addTwoNum2() {
			synchronized (aa) {
				aa.num2 += 2;
				System.out.println("addTwoNum2 : " + aa.num2);
			}
		}

		public void showAllNums() {
			synchronized(aa) {
			System.out.println("num1 : " + aa.num1);
			System.out.println("num2 : " + aa.num2);
		}}

		Object key1 = new Object();
		Object key2 = new Object();

	}

	class AccessThread extends Thread {

		IHaveTwoNum twoNumInst;

		public AccessThread(IHaveTwoNum inst) {
			twoNumInst = inst;
		}

		@Override
		public void run() {
			
			synchronized(twoNumInst.aa) {
			twoNumInst.addOneNum1();
			twoNumInst.addTwoNum1();

			twoNumInst.addOneNum2();
			twoNumInst.addTwoNum2();

		}}

	}
}