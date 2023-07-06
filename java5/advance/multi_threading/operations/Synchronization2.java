package com.java5.advance.multi_threading.operations;

//Future Classes
//Coleteable Future
//Thread Local
//Thread Pool
public class Synchronization2 {

	public static void main(String[] args) {
		Operation op1 = new Operation();
		Thread3 t3 = new Thread3(op1);
		t3.setName("t3");
		Thread4 t4 = new Thread4(op1);
		t4.setName("t4");
		t3.start();
		t4.start();

	}

}

class Operation {

	synchronized void printNum(int n) {//now this printNum is synschronized
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i + " => " + Thread.currentThread() + " | "+Thread.currentThread().getState());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Thread3 extends Thread {
	Operation ops;

	public Thread3(Operation ops) {
//		super();
		this.ops = ops;
	}

	@Override
	public void run() {
		ops.printNum(25);
	}

}

class Thread4 extends Thread {
	Operation ops;

	public Thread4(Operation ops) {
//		super();
		this.ops = ops;
	}

	@Override
	public void run() {
		ops.printNum(20);
	}

}
