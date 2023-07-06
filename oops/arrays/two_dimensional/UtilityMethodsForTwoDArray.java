package com.javab5.java.oops.arrays.two_dimensional;

import java.util.Arrays;

public class UtilityMethodsForTwoDArray {

	public static void main(String[] args) {

		int[][] matrix2 = { { 3, 3, 66, 754, 67, 45 }, { 35, 234, 7, 6 }, { 5, 456, 999, 567, 5677 } };

		for (int i = 0; i < matrix2.length; i++) {
			System.out.println(Arrays.toString(matrix2[i]));
		}

		for (int i = 0; i < matrix2.length; i++) {
			Arrays.sort(matrix2[i]);
		}

		System.out.println();

		for (int i = 0; i < matrix2.length; i++) {
			System.out.println(Arrays.toString(matrix2[i]));
		}
		
		//Matrix Addition, Substraction
		//Matrix Multiplication

	}

}
