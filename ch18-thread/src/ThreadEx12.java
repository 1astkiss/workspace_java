
public class ThreadEx12 {

	public static void main(String[] args) {

		Sum sum = new Sum();
		AdderThread at1 = new AdderThread(sum, 1, 50);
		AdderThread at2 = new AdderThread(sum, 51, 100);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합 : " + sum.getNumber());
	}

}

class Sum{
	
	int num;
	
	public Sum() {
		num = 0;
	}
	
	public void addNumber(int n) {
		num += n;
	}
	
	public int getNumber() {
		return num;
	}
}

class AdderThread extends Thread {

	Sum sumInst;
	int start, end;
	
	public AdderThread(Sum sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	
	public void run() {
		
		for(int i = start; i <= end; i++) {
			sumInst.addNumber(i); 
		}
		
		
	}
}