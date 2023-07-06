package com.java5.advance.multi_threading.operations;

public class VolatileExample {

	static volatile boolean flag = true;//VISIBLITY PROBLEM

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			while (flag) {
				System.out.println("STOP ME IF YOU CAN");
			}

		});
		t1.start();
		
		
		Thread t2 = new Thread(() -> {
			flag = false;
		});
		t2.start();
	}

}
