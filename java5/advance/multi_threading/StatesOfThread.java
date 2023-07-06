package com.java5.advance.multi_threading;

public class StatesOfThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START => " + Thread.currentThread().getName());

		CustomThread1 t1 = new CustomThread1();
		t1.setName("t1");
		System.out.println(t1.getState());
		t1.start();
		t1.join();//the other threads will wait for t1 to complete

		System.out.println(t1.getState());
		System.out.println("END => " + Thread.currentThread().getName());

	}

}
