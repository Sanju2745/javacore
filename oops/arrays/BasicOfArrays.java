package com.javab5.java.oops.arrays;

import java.util.Arrays;

public class BasicOfArrays {

	// There is nio concept of Garbage Value as we have on C and C++
	public static void main(String[] args) {

		// 7 integers
		int[] arrayOfIntegers = new int[7];

		String[] namesOfMovies = new String[7];

//		arrayOfIntegers = null;
		System.out.println(arrayOfIntegers);// hashCode is being printed in HEX form
		System.out.println(arrayOfIntegers.hashCode());

		for (int i = 0; i < arrayOfIntegers.length; i++) {
			System.out.print(arrayOfIntegers[i] + " ");
		}

		System.out.println();
		System.out.println(namesOfMovies);
		for (String movie : namesOfMovies) {// for each
			System.out.print(movie + " ");
		}

		System.out.println();
		Toy toys[] = new Toy[4];// 4 spaces for toy objects
		System.out.println(Arrays.toString(toys));

		toys[1] = new Toy();
		toys[toys.length - 1] = new Toy();
		System.out.println(Arrays.toString(toys));

	}
}
