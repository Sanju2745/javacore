package com.java5.advance.multi_threading;

public class CustomThread1 extends Thread {// #1 using Thread class

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " => " + Thread.currentThread() + " | state "+Thread.currentThread().getState());

		}
	}

}
