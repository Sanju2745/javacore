package com.javab5.java.oops.exception_handling;

import java.util.Arrays;

public class CheckedVsUncheckedExceptions {

	public static void main(String[] args) {
		System.out.println("START");
		int size = 8;
		int x = 0;
		int[] num = new int[size];
		Arrays.fill(num, 60);
		System.out.println(Arrays.toString(num));

//		System.out.println(num[num.length]);// Unchecked Exception

		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {// Checked Exceptions - You must handle it
				e.printStackTrace();
			}
			System.out.println("Hello");
		}

//		try {
//			System.out.println("suman");
//			System.out.println(0.0 / 0);
////			System.out.println(num[num.length / x]);// Exception
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch 1");
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("catch 2");
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("catch 3");
//			e.printStackTrace();
//		}

		System.out.println("END");

	}

}
