package com.java5.advance.multi_threading;

public class Main {//Single Thread Program 
//	main thread

	public static void main(String[] args) {

		System.out.println("START");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " => "+Thread.currentThread().getName());

		}
		System.out.println("END");
	}

}
