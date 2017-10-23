
public class ThreadEx13 {

	public static void main(String[] args) {

		SharedData data = new SharedData();
		
		UpThread t1 = new UpThread(data, "Up Thread");
		DownThread t2 = new DownThread(data, "Down Thread");
		
		t1.start();
		t2.start();
	}

}

class SharedData {

	int data;

	public synchronized void up(String name) {
		System.out.print(name + ": " + data);
		data++;
		System.out.println("∑Í" + data + "∑Œ ¡ı∞°Ω√≈¥");
	}

	public synchronized void down(String name) {
		System.out.print(name + ": " + data);
		data--;
		System.out.println("∑Í" + data + "∑Œ ∞®º“Ω√≈¥");
	}
}

class UpThread extends Thread {

	SharedData data;
	String name;

	public UpThread(SharedData data, String name) {

		this.data = data;
		this.name = name;

	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

			data.up(name);
		}
	}
}

class DownThread extends Thread {

	SharedData data;
	String name;

	public DownThread(SharedData data, String name) {

		this.data = data;
		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 0; i < 4; i++) {

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

			data.down(name);
		}
	}
}