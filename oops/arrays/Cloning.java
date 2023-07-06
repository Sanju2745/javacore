package com.javab5.java.oops.arrays;

import java.util.Arrays;

public class Cloning {

	public static void main(String[] args) {

		int[] arr = { 43, 345, 45, 56, 56, 57, 35, 90 };

		int[] arr2 = arr;// aasigning the refernce

//		Manual Cloning
//		int[] arr3 = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr3[i] = arr[i];
//		}

		int[] arr3 = arr.clone();// cloning of array can only be done if its a 1D array

		modify(arr3);
		System.out.println(Arrays.toString(arr));
	}

	private static void modify(int[] arr) {
		Arrays.fill(arr, -1);

	}

}
