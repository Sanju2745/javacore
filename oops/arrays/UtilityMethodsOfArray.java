package com.javab5.java.oops.arrays;

import java.util.Arrays;

public class UtilityMethodsOfArray {

	public static void main(String[] args) {

		int[] arr = { 43, 54, 775, 876, 8734, 1, 34, 645, 67, 88 };// ascending order

//		Arrays.sort(arr);// Dual-Pivot QuickSort
		System.out.println(Arrays.toString(arr));

//		100
//		Arrays.fill(arr, 100);
//		System.out.println(Arrays.toString(arr));

		int index = Arrays.binarySearch(arr, 8735);
		System.out.println(index);

		modify(4);
		modify(4, 4, 34, 45, 7);
		modify(arr);

	}

//	thu fri sat
	static void modify(int... sample) {// var args
		System.out.println(Arrays.toString(sample));
	}

}
