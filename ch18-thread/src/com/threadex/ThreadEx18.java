package com.threadex;

public class ThreadEx18 {

	public static void main(String[] args) {

		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadA.isWork = false;
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadA.isWork = true;
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadA.isStop = true;
		threadB.isStop = true;
		
	}

}

class ThreadA extends Thread {
	
	public boolean isStop = false;
	public boolean isWork = true;
	
	@Override
	public void run() {
		
		while(!isStop) {
			
			if(isWork) {
				System.out.println("ThreadA �۾�");
			}else {
				yield();
			}
		}
		
		System.out.println("ThradA ����");
	}
}

class ThreadB extends Thread {
	
	public boolean isStop = false;
	public boolean isWork = true;
	
	@Override
	public void run() {
		
		while(!isStop) {
			
			if(isWork) {
				System.out.println("ThreadB �۾�");
			}else {
				yield();
			}
		}
		
		System.out.println("ThreadB ����");
	}
}