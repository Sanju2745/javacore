package com.javab5.java.oops.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ListOfPrimesTillN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter till n of primes MAX Value:2000");
		int n = scanner.nextInt();

		long start = System.nanoTime();
		if (n > 2000) {
			System.out.println("Illegal Input");
			return;
		}

		int[] arrayOfPrimes = new int[n];

		int count = 0;

		for (int i = 2; count < n; i++) {

			boolean prime = isPrime(i);

			if (prime) {
				arrayOfPrimes[count++] = i;
			}

		}
//		System.out.println(isPrime(n));
		long end = System.nanoTime();
		System.out.println("Time difference ==> " + (end - start));
		System.out.println(Arrays.toString(arrayOfPrimes));

	}

	static boolean isPrime(int sample) {// 81

//		11 = 1, 11
		for (int i = 2; i * i < sample; i++) {
//		for (int i = 2; i < sample; i++) {
			if (sample % i == 0)
				return false;
		}
		return true;
	}
}
