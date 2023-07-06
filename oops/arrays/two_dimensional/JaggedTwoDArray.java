package com.javab5.java.oops.arrays.two_dimensional;

import java.util.Arrays;

public class JaggedTwoDArray {

	public static void main(String[] args) {

		int[][] matrix = new int[4][];

		matrix[0] = new int[3];
		matrix[1] = new int[1];
		matrix[2] = new int[3];
		matrix[3] = new int[2];

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

		int[][] matrix2 = { { 3, 54, 67, 45 }, { 35, 6 }, { 5, 456, 567, 5677, } };

		System.out.println();
		for (int i = 0; i < matrix2.length; i++) {
			System.out.println(Arrays.toString(matrix2[i]));
		}

	}
}
