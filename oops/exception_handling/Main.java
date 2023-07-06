package com.javab5.java.oops.exception_handling;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) {

		System.out.println("START");
		Scanner sc = new Scanner(System.in);// resource
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
//		int size = 8;
		int x = 0;

		int[] num = new int[size];
		Arrays.fill(num, 60);
		System.out.println(Arrays.toString(num));

		try {
			System.out.println("suman");
			System.out.println(5 / 0);
//			System.out.println(num[num.length / x]);// Exception
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch 1");
			e.printStackTrace();
		} catch (ArithmeticException e) {
//			System.out.println("catch 2");
			e.printStackTrace();
		} catch (Exception e) {
//			System.out.println("catch 3");
			e.printStackTrace();
		} finally {// no matter what this block will execute | finalize TODO
			System.out.println("CLosed");
			sc.close();// resource closing
		}

		// Error | Exception (Logical mistake)

//		call();

		System.out.println("END");

	}

	static void call() {
		System.out.println("CAllll => " + ++count);
		call();
	}

}
