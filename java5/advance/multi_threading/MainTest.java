package com.java5.advance.multi_threading;

public class MainTest {

	public static void main(String[] args) {

		System.out.println("START => " + Thread.currentThread().getName());
		CustomThread1 t1 = new CustomThread1();
		t1.setName("t1");
		t1.start();

		CustomThread1 t2 = new CustomThread1();
		t2.setName("t2");
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);// p [ 1 - 10], 5
//		
//		
		CustomThread1 t3 = new CustomThread1();
		t3.setName("t3");
		t3.start();

		Thread t4 = new Thread(new CustomWork());// Runnable is a work & Thread is a worker
		t4.setName("t4");
		t4.start();

		Thread t5 = new Thread(new Runnable() {//using annonymous inner class

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i + " => " + Thread.currentThread());

				}

			}
		});
		t5.start();

		Thread t6 = new Thread(() -> {//using lambda fn
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i + " => " + Thread.currentThread());

			}
		});
		t6.start();

		System.out.println("END => " + Thread.currentThread().getName());

	}// Thread Scheduled

}
