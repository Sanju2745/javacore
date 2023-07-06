package com.javab5.java.oops.exception_handling;

public class SomeMoreCombo {

	public static void main(String[] args) {
		try {
//			while (true) {
//				System.out.println("hehe ");
//				
//			}
			System.exit(0);
			return;// return keyword has no effect on finally
//			System.out.println(9/0);
		} finally {
			System.out.println("Finally");
		}

//		catch (Exception e) {
//			System.out.println(e);
//		}

	}

	static void call() {
		System.out.println("call...");
		call();
	}

}
