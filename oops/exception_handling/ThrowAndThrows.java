package com.javab5.java.oops.exception_handling;

import javax.security.auth.callback.Callback;

public class ThrowAndThrows {

	public static void main(String[] args) {// DEH Default Exceptiuon Handler

		try {
			callA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void callA() throws InterruptedException {

				callB();
	}

	private static void callB() throws InterruptedException  {

			callC();
	

	}

	private static void callC() throws InterruptedException   {

			Thread.sleep(0);//checked
		System.out.println(7 / 0);
	}
}
