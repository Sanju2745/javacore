package com.java5.advance.multi_threading.operations;

import java.util.concurrent.atomic.AtomicInteger;

public class Synchroization {

//	static int x = 1;
	
	static AtomicInteger a = new AtomicInteger(1);//one thread can acceess at one time

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
//			++x;// x = x+1  //READING CHANGIMG UPDATING
			a.incrementAndGet();
		});
		t1.start();
//		t1.join();

		Thread t2 = new Thread(() -> {
			a.incrementAndGet();
		});
		t2.start();
//		t2.join();

		Thread t3 = new Thread(() -> {
			a.incrementAndGet();
		});
		t3.start();
//		t3.join();

		Thread t4 = new Thread(() -> {
			a.incrementAndGet();
		});
		t4.start();
//		t4.join();

		Thread.sleep(2000);
		System.out.println(a);

	}

}
